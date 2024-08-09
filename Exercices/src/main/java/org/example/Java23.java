package org.example;

public class Java23 {

    static abstract class Shape{

        int height;
        int width;
        abstract void calculateArea();
        abstract void calculatePerimeter();
    }
    static class Circle extends Shape{
        int radius;
        void calculateArea() {
        }

        void calculatePerimeter() {
        }
    }

    static class Triangle extends Shape{
        void calculateArea() {
        }

        void calculatePerimeter() {
        }
    }

    public static void main(String[] args) {

    }
}
