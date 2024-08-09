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
    //Mutex forkLeft;
    //Mutex forkRight;

    boolean isWaitingForAFork = false;

    boolean forkIsReleased = false;

    boolean isAlive = true;

    Philosopher(int number, int time_to_die, int time_to_eat, int time_to_sleep, Semaphore forks) {
        this.number = number;
        this.time_to_die = time_to_die;
        this.time_to_eat = time_to_eat;
        this.time_to_sleep = time_to_sleep;
        this.forks = forks;

        // In Mutex we need to have to keep track of which fork is grabbed
        //this.forkLeft = forks[number];
        //this.forkRight = forks[number + 1 % forks.length];
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

    public void sleep(){
        System.out.println("Philosopher" + number + " is sleeping");
        try {
            Thread.sleep(time_to_sleep);
        } catch (InterruptedException e) {
           //throwException(e);
            Thread.currentThread().interrupt();
        }
    }

    public void think() {
        System.out.println("Philosopher" + number + " is thinking");
    }

    public void checkIfAlive() {
        if ((this.lastTimeAte - this.startingTime) > this.time_to_die) {
            isAlive = false;
        }
    }

    static void throwException(InterruptedException e) throws Exception{
        throw new Exception(e);
    }

    public void run() {
        while (isAlive) {
            isWaitingForAFork = true;
            checkIfAlive();
        }
    }
}
