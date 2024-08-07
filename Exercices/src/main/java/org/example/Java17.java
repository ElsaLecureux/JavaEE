package org.example;

public class Java17 {
    public static class Car{

         String make;
        String model;
        String year;

        public Car( String make, String model, String year){
            this.make = make.isEmpty() ? "Unknown Model" : make;
            this.model = model.isEmpty() ? "Unknown Model" :  model;
            this.year =  year.isEmpty() ? "2000" : year;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", "2021");
        Car car2 = new Car("","","");
        System.out.println("Make: " + car1.make + " Model: " + car1.model + " Year: " + car1.year);
        System.out.println("Make: " + car2.make + " Model: " + car2.model + " Year: " + car2.year);
    }
}
