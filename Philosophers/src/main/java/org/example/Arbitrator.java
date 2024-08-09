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
                // pause thread
            }
        }
    }

    // kill thread if the behavior is incorrect

}
