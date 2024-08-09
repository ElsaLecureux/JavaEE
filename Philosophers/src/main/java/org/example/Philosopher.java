package org.example;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {

    int number;
    int time_to_die;
    int time_to_eat;
    int time_to_sleep;

    Semaphore forks;

    // for Mutex not semaphore though
    Semaphore forkLeft;
    Semaphore forkRight;

    boolean isEquipped = false;

    Philosopher(int number, int time_to_die, int time_to_eat, int time_to_sleep, Semaphore forks) {
        this.number = number;
        this.time_to_die = time_to_die;
        this.time_to_eat = time_to_eat;
        this.time_to_sleep = time_to_sleep;
        this.forks = forks;
    }

    public void eat() {
        System.out.println("Philosopher" + number + " is eating");
        try {
            Thread.sleep(time_to_eat);
            // change time_to_die
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void sleep() {
        System.out.println("Philosopher" + number + " is sleeping");
        try {
            Thread.sleep(time_to_sleep);
            // change time_to_die - 200
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void think() {
        System.out.println("Philosopher" + number + " is thinking");
    }

    public void run() {
        while (time_to_die > 0) {
            try {
               // System.out.println("Philosopher " + number + " is trying to acquire a fork");
                forks.acquire(1);
                try {
                   // System.out.println("Philosopher " + number + " is trying to acquire second fork");
                    forks.acquire(1);
                   // System.out.println("Philosopher " + number + " has acquired 2 forks");
                    eat();
                   //System.out.println("Philosopher " + number + " is releasing 2 forks");
                    forks.release(1);
                    forks.release(1);
                    sleep();
                    think();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
