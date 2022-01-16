import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = new int[30];
        int max = array[0];
        int i,temp;
        int index = 0;
        int count = 0 ;
        Scanner myscanner = new Scanner(System.in);
        for( i=1;i<array.length;i++) {
            System.out.println("array"+"["+i+"]"+':');
            array[i] = myscanner.nextInt();
            if(array[i]==0) {
                break;
            }count++;}
       for (i=0;i<count-1;i++){
        for (int j = count-1;j > i;j--){
                if (array[j] < array[j - 1]) {
                    temp = array[j ];
                    array[j ] = array[j-1];
                    array[j-1] = temp;
            }
        }
    }for (i=0;i<count;i++){
            System.out.println(array[i]);
        }
    }
}
