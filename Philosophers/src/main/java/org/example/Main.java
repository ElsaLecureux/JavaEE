package org.example;
import java.util.concurrent.Semaphore;

public class Main {
    static int number_of_philosophers = 5;

    //for Mutex idea of [] but not semaphore
    //public static Semaphore[] forks = new Semaphore[number_of_philosophers];



    public static Philosopher[] philosophers = new Philosopher[number_of_philosophers];

    public static void main(String[] args) {

        Semaphore forks = new Semaphore(number_of_philosophers);

        /*for Mutex for ( int i = 0; i < number_of_philosophers; i++ ){
            create one fork for each philosopher
        }*/

        for ( int i = 0; i < number_of_philosophers; i++ ) {
            philosophers[i] = new Philosopher(i + 1, 601, 200, 200, forks);
            new Thread(philosophers[i]).start();
        }
    }
}