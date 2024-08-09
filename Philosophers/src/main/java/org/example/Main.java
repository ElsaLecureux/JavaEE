package org.example;
import java.util.concurrent.Semaphore;

public class Main {
    static int time_to_die = 600;
    static int time_to_eat = 200;
    static int time_to_sleep = 200;
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

            philosophers[i] = new Philosopher(i + 1, time_to_die, time_to_eat, time_to_sleep, forks);
            new Thread(philosophers[i]).start();
        }

        Arbitrator arbitrator = new Arbitrator(philosophers);
        new Thread(arbitrator).start();
    }
}