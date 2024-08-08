package org.example;

public class Philosopher implements Runnable {
    public void eat(){
        System.out.println("Philosopher is eating");
    }
    public void sleep(){
        System.out.println("Philosopher is sleeping");
    }
    public void think(){
        System.out.println("Philosopher is thinking");
    }
    public void run() {
        eat();
        sleep();
        think();
         //if philosopher !dead run();
    }
}
