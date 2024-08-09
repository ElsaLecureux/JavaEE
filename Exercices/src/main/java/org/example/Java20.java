package org.example;

public class Java20 {
    public static class Shape{
        int height;
        int width;
        public Shape(){
        }
        void getArea(int height, int width){
        }
    }
    public static class Rectangle extends Shape {

        @Override
        public void getArea(int height, int width){
            int area = height * width;
            System.out.println("The area of the rectangle is: " + area);
        }
    }
    public static void main(String[] args) {
       int height = 6;
       int width = 5;
        new Rectangle().getArea(height,width);
    }
}
