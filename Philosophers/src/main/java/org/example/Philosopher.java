package org.example;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable {

    int number;
    int time_to_die;
    int time_to_eat;
    int time_to_sleep;

    Semaphore forkLeft;

    Semaphore forkRight;

    boolean isEquipped = false;

    Philosopher(int number, int time_to_die, int time_to_eat, int time_to_sleep, Semaphore[] forks){
        this.number = number;
        this.time_to_die = time_to_die;
        this.time_to_eat = time_to_eat;
        this.time_to_sleep = time_to_sleep;

        this.forkLeft = forks[number];
        this.forkRight = forks[(number + 1)];
    }

    public void eat(){
        System.out.println("Philosopher" + number + " is eating");
        try {
            Thread.sleep(time_to_eat);
        } catch (InterruptedException e) {

        }
    }
    public void sleep(){
        System.out.println("Philosopher" + number + " is sleeping");
        try {
            Thread.sleep(time_to_sleep);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public void think(){
        System.out.println("Philosopher" + number + " is thinking");
    }

    public boolean getTwoForks() {
        /* trying to acquire 2 forks*/
        if(forkRight.tryAcquire()) {
            return forkLeft.tryAcquire();
        } else {
            //temporary
            time_to_die = 0;
            return false;
        }
    }

    public void run() {
        while (time_to_die > 0) {
            if (getTwoForks()){
                eat();
                sleep();
            };
                think();
                run();
        }
    }
}
