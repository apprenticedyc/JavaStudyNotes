import java.util.Scanner;
public class ArrayExercise02 {
    public static void main(String[] args) {
        int [] arrary = new int[30];
        int max=arrary[0];
        int index=0;
        Scanner myscanner = new Scanner(System.in);
       for(int i=1;i<arrary.length;i++) {
           System.out.println("array"+"["+i+"]"+':');
           arrary[i] = myscanner.nextInt();
           if(arrary[i]==0) {
               break;
           }
           if (arrary[i]>max){
               max=arrary[i];
               index=i;
           }
       }
        System.out.println("最大值是:"+max+"其下标是"+index);
    }
}
