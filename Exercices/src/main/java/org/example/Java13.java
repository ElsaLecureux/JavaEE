package org.example;

public class Java13 {
    public static class Dog {
        String name;
        String color;

        public Dog(String name, String color){
            this.name =  name;
            this.color = color;
        }
    }
    public static void main(String[] args) {
        Dog myDog= new Dog("Bailey", "Black");
        System.out.println("Dog's Name: " + myDog.name + "Dog's Color: " + myDog.color);
    }
}
