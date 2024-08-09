package org.example;
import java.lang.Math;

public class Java24 {
    public interface Shape{
        public void getArea();
    }
    public static class Rectangle implements Shape{
        int height = 0;
        int width = 0;
        @Override
        public void getArea() {
        }
        public void getArea(int height, int width) {
            int area = height * width;
            System.out.println(":" + area);
        }
    }
    public static class Circle implements Shape{
        int radius = 0;
        @Override
        public void getArea() {
        }
        public void getArea(int radius) {
            double area = Math.PI * radius * radius;
            System.out.println(":" + area);
        }
    }
    public static class Triangle implements Shape{
        int height = 0;
        int base = 0;
        @Override
        public void getArea() {
        }

        public void getArea(int height, int base) {
            int area = (height * base)/2;
            System.out.println(":" + area);
        }
    }
    public static void main(String[] args) {

    }
}

