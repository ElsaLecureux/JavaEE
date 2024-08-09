package org.example;

public class Java19 {
    public static class Singleton{

        private static Singleton instance = null;

        private Singleton(){
            System.out.println("Singleton instance created.");
        }
        public static Singleton getInstance() {
            if(instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton.getInstance();

    }
}
