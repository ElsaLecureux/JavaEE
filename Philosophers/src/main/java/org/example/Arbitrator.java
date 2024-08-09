package org.example;

public class Arbitrator implements Runnable {

    //receives all philosophers
    private final Philosopher[] philosophers;

    public Arbitrator(Philosopher[] philosophers) {
        this.philosophers = philosophers;
    }

    // controls each thread to make sure they have the correct behavior
    @Override
    public void run(){
        for(Philosopher philosopher : philosophers){
            if(philosopher.isWaitingForAFork) {

                while (philosopher.isAlive) {
                    try {
                        philosopher.isWaitingForAFork = true;
                        philosopher.forks.acquire(1);
                        try {
                            philosopher.forks.acquire(1);
                            philosopher.isWaitingForAFork = false;
                            philosopher.checkIfAlive();
                            if(philosopher.isAlive) {
                                philosopher.eat();
                                philosopher.forks.release(1);
                                philosopher.forkIsReleased = true;
                                philosopher.forks.release(1);
                                philosopher.forkIsReleased = true;
                                philosopher.sleep();
                                philosopher.think();
                            } else {
                                System.out.println("Philosopher " + philosopher.number + " is dead");

                                //Stop program;
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
                // pause thread
                philosopher.eat();
            }
        }
    }

    // kill thread if the behavior is incorrect

}
