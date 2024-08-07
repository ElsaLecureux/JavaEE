package org.example;

public class Java12 {
    public static class Cat {
        String name;
        Integer age;
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }


    public static void main(String[] args) {
        Cat myCat = new Cat("Unknown", 0);
        System.out.println("Cat's name: " + myCat.name + " Cat's age: " + myCat.age);
    }
}
