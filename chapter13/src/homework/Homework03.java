package homework;
/*
  按格式输出
 */

import java.util.Scanner;

/**
 * @author Hex
 * @version 17
 */
public class Homework03 {
    public static void main(String[] args) {
        System.out.println("请输入你的名字");
        String name = new Scanner(System.in).nextLine();
        printName02(name);

        //printName01();
    }

    public static void printName01() {
        System.out.println("请输入你的姓名");
        String[] strings = new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        String format = String.format("%s,%s.%c", strings[2], strings[1], strings[0].charAt(0));
        System.out.println(format);
    }

    public static void printName02(String str) {
        if (str == null) {
            System.out.println("str 不能为空");
            return;
        }
            String[] s = str.split(" ");
            if (s.length != 3) {
                System.out.println("输入格式不正确");
                return;
            }
        String format = String.format("%s,%s.%s", s[2], s[1], s[0].toUpperCase().charAt(0));
        System.out.println(format);
    }

}