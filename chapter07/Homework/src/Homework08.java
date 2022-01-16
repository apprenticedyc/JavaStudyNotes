public class Homework08 {
    public static void main(String[] args) {
        PassObject po = new PassObject();
        Circle01 c1 = new Circle01();
        po.printAreas(c1, 5);
    }
}
class Circle01 {
    double radius ;
    public double findArea() {
        return Math.PI * radius * radius;
    }
    public void setRadius(double afterradius) {
        this.radius = afterradius;
    }
}
class PassObject {
    public void printAreas(Circle01 c, int times) {
        System.out.println("Radius\tArea");
        for (double s = 1; s <= times; s++) {
            c.setRadius(s);//修改对象c的半径值
            System.out.println(s + "\t"+c.findArea());
        }
    }
}
