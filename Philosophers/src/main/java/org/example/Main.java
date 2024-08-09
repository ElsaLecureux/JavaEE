package org.example;
import java.util.concurrent.Semaphore;

public class Main {
    static int time_to_die;
    static int time_to_eat;
    static int time_to_sleep;
    static int number_of_philosophers = 5;

    //for Mutex idea of [] but not semaphore
    //public static Mutex[] forks = new Mutex[number_of_philosophers];

        public static Philosopher[] philosophers = new Philosopher[number_of_philosophers];

    public static void main(String[] args) {

        Semaphore forks = new Semaphore(number_of_philosophers);

        /*for Mutex for ( int i = 0; i < number_of_philosophers; i++ ){
            create one fork for each philosopher
            Mutex forks = new Mutex(number_of_philosophers);
        }*/

        for ( int i = 0; i < number_of_philosophers; i++ ) {

            philosophers[i] = new Philosopher(i + 1, 601, 200, 200, forks);
            new Thread(philosophers[i]).start();
        }

        Arbitrator arbitrator = new Arbitrator(philosophers);
        new Thread(arbitrator).start();
    }
}