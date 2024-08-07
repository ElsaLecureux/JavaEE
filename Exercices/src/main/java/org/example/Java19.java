package org.example;

public class Java19 {
    public static class Singleton{

        private static Singleton instance;
        public String value;

        private Singleton(String value){
            this.value = value;
        }
        public static Singleton getInstance(String value) {
            if(instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton.getInstance("");
        System.out.println("Singleton instance created.");
    }
}
