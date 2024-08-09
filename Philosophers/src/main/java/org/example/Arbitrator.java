package org.example;

public class Arbitrator implements Runnable {

    //receives all philosophers

    private final Philosopher[] philosophers;

    public Arbitrator(Philosopher[] philosophers) {
        this.philosophers = philosophers;
    }

    boolean philosopherIsDead = false;

    // controls each thread to make sure they have the correct behavior
    @Override
    public void run(){
        while (!philosopherIsDead) {
            for(Philosopher philosopher : philosophers){
                synchronized (philosopher) {
                    if (philosopher.isWaitingForAFork && philosopher.isAlive) {
                        philosopher.isWaitingForAFork = false;
                        try {
                            philosopher.forks.acquire(1);
                            try {
                                philosopher.forks.acquire(1);
                                philosopher.checkIfAlive();
                                if (philosopher.isAlive) {
                                    philosopher.eat();
                                    philosopher.forks.release(1);
                                    philosopher.forks.release(1);
                                    philosopher.sleep();
                                    philosopher.think();
                                } else {
                                    System.out.println("Philosopher " + philosopher.number + " is dead");
                                    philosopherIsDead = false;
                                    System.exit(0);
                                }
                            } catch (InterruptedException e) {
                                System.out.println("Philosopher " + philosopher.number + " is waiting for a fork");
                                Thread.currentThread().interrupt();
                            }
                        } catch (InterruptedException e) {
                            System.out.println("Philosopher " + philosopher.number + " is waiting for a fork");
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }

    }
}
