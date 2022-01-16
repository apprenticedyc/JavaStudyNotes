import java.util.Scanner;

public class MethodExercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AA2 a = new AA2();
        System.out.println("请输入一个数");
        int n = input.nextInt();
        if (a.isOdd(n)) {
            System.out.println("是奇数");

        } else {
            System.out.println("是偶数");
        }

    }
}

//编写一个AA类,有一个方法:判断一个数是奇数还是偶数,返回boolean
class AA2 {
    public boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        }
        return false;
    }
}
