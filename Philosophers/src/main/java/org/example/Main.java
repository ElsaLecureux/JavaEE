package org.example;
import java.util.concurrent.Semaphore;

public class Main {
    static int number_of_philosophers = 5;

    public static Semaphore[] forks = new Semaphore[number_of_philosophers];

    public static Philosopher[] philosophers = new Philosopher[number_of_philosophers];

    /*end program*/


    public static void main(String[] args) {

        for ( int i = 0; i < number_of_philosophers ; i++ ) {
            forks[i] = new Semaphore(1);
        }

        for ( int i = 0; i < number_of_philosophers ; i++ ) {
            philosophers[i] = new Philosopher(i, 601, 200, 200, forks);
            new Thread(philosophers[i]).start();
        }

    }
}