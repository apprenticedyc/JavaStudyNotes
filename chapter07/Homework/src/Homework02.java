import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = {"dyc","xyh","xx","dpg" };
        System.out.println("请输入字符");
        String s = input.next();
        A02 a02 =new A02();
        System.out.println(a02.find(str, s));
    }
}

class A02 {
    public int find(String[] find, String tofind) {
        for (int i = 0; i < find.length; i++) {
            if (find[i].equals(tofind)) {
                return i;
            }
        }
        return -1;
    }

}