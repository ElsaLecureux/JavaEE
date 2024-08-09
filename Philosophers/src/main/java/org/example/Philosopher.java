package org.example;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {

    int number;
    int time_to_die;
    int time_to_eat;
    int time_to_sleep;

    Semaphore forks;

    long startingTime = System.currentTimeMillis();

    long lastTimeAte = System.currentTimeMillis();

    // for Mutex not semaphore though
    Semaphore forkLeft;
    Semaphore forkRight;

    boolean isAlive = true;

    Philosopher(int number, int time_to_die, int time_to_eat, int time_to_sleep, Semaphore forks) {
        this.number = number;
        this.time_to_die = time_to_die;
        this.time_to_eat = time_to_eat;
        this.time_to_sleep = time_to_sleep;
        this.forks = forks;
    }

    public void eat() {
        lastTimeAte = System.currentTimeMillis();
            System.out.println("Philosopher" + number + " is eating");
            try {
                Thread.sleep(time_to_eat);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
    }

    public void sleep() {
        System.out.println("Philosopher" + number + " is sleeping");
        try {
            Thread.sleep(time_to_sleep);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void think() {
        System.out.println("Philosopher" + number + " is thinking");
    }

    public void checkIfAlive() {
        System.out.println(this.time_to_die );
        if (this.lastTimeAte - this.startingTime > this.time_to_die) {
            isAlive = false;
        }
    }

    public void run() {
        while (isAlive) {
            try {
               // System.out.println("Philosopher " + number + " is trying to acquire a fork");
                forks.acquire(1);
                try {
                   // System.out.println("Philosopher " + number + " is trying to acquire second fork");
                    forks.acquire(1);
                   // System.out.println("Philosopher " + number + " has acquired 2 forks")
                    checkIfAlive();
                    if(isAlive) {
                        eat();
                        //System.out.println("Philosopher " + number + " is releasing 2 forks");
                        forks.release(1);
                        forks.release(1);
                        sleep();
                        think();
                    } else {
                        System.out.println("Philosopher " + number + " is dead");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
