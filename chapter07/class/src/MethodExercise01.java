import java.util.Scanner;

public class MethodExercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AA2 a = new AA2();
        System.out.println("������һ����");
        int n = input.nextInt();
        if (a.isOdd(n)) {
            System.out.println("������");

        } else {
            System.out.println("��ż��");
        }

    }
}

//��дһ��AA��,��һ������:�ж�һ��������������ż��,����boolean
class AA2 {
    public boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        }
        return false;
    }
}
