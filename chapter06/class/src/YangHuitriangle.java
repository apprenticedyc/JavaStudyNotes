import java.util.Scanner;
public class YangHuitriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入层数");
       int n = input.nextInt();
        int[][]yangHui = new int[n][];
        for (int i=0;i< yangHui.length;i++){
           //给每个一维数组(行)开空间
            yangHui[i] = new int[i+1];
            //给每个一维数组(行)赋值
            for (int j=0;j<yangHui[i].length;j++){
            //每一行的第一个元素和最后一个元素都是1
               if (j==0||j==yangHui[i].length-1){
                   yangHui[i][j] = 1;
               }  else{
                   yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                   }
            }
        }    //输出杨辉三角
        for (int i = 0; i < yangHui.length;i++){
            for(int j = 0;j< yangHui[i].length;j++){
                System.out.print(yangHui[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
