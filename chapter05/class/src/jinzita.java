import java.util.Scanner;
public class jinzita {
    public static void main(String[] args) {
        int i ,j,k,n;
        Scanner myscanner = new Scanner(System.in);
        n = myscanner.nextInt();
        for (i=1;i<=n;i++){
        for (j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
