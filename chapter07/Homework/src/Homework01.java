import java.util.Scanner;
public class Homework01 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double [] array= new double[10];
for (int i = 0; i <array.length; i++) {
    System.out.println("a[" + i + "]=");
    array[i] = input.nextDouble();
        }
            A01 test = new A01();
    System.out.println(test.max(array));


    }
}
class A01{
    public double max(double[] a){
        double max=a[0];
        for (int i = 1; i <a.length ; i++) {
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
}