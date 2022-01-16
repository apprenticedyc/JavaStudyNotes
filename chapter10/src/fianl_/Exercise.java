package fianl_;

public class Exercise {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.calArea());
    }
}
class Circle{
   static  {
        PI=3.14;
    }

private double radius;
private final static double PI;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calArea(){
        return PI*Math.pow(radius,2);
    }
}