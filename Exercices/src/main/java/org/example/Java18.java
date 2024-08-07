package org.example;

public class Java18 {
    public static class Point{
        Integer x;
        Integer y;

        public Point(Integer x, Integer y){
            this.x = x;
            this.y = y;
        }

        public Point( Double x, Double y){
            this.x = x.intValue();
            this.y = y.intValue();
        }
    }
    public static void main(String[] args) {
        Point point1= new Point(4, 5);
        Point point2 = new Point(4.2,5.4);
        System.out.println("Point (x, y): (" + point1.x + ", " + point1.y + ")");
        System.out.println("Point (x, y): (" +point2.x  + ", " + point2.y + ")");
    }
}
