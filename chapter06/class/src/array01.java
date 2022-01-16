import java.util.Scanner;
public class array01 {
    public static void main(String[] args) {
        int i;
        double[] scores = new double[5];
        for (i=0;i<5;i++){
            System.out.println("hens"+"["+i+"]= ");
            Scanner input =new Scanner(System.in);
             scores[i] =input.nextDouble();
        }


        for (i=0;i<5;i++){
            System.out.println(scores[i]);
            
        }
    }
}
