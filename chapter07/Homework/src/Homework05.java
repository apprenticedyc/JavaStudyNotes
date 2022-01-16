public class Homework05 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.area());
        System.out.println(circle.zhouchang());
    }
}

class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * this.radius;
        //方法中没有局部变量radius则该radius就是属性,因此可以省略this
    }

    public double zhouchang() {
        return 2 * Math.PI * radius;
    }
}