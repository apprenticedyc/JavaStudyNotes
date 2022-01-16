import java.util.Scanner;
public class Input {

    public static void main(String[] args) {
//1.引入scanner类
//2.创建一个scanner对象
        Scanner myscanner = new Scanner(System.in);//System.in代表从键盘输入
        //my Scanner就是Scanner类的对象

        //接受用户输入,使用相关方法
        //当程序运行到next方法时会等待用户输入
        System.out.println("your name plz");
        String name = myscanner.next();//用方法.next接受用户输入字符串
        System.out.println("your age plz");
        int age = myscanner.nextInt();//用方法.next接受用户输入int
        System.out.println("your salary plz");
        double salary = myscanner.nextDouble();//用方法.next接受用户输入double
        System.out.println("人的信息如下");
        System.out.println("name="+ name +"age="+age+"salary="+salary);
    }
}
