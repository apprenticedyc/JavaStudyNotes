package com.Hex.cn.try_;

import java.util.Scanner;

/**
 * @author Hex
 * @version 17
 */
public class TryCatchExercise {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new TryCatchExercise().inputInt();
        new TryCatchExercise().inputInt2();
    }

    //递归加异常处理机制,让用户输入一个整数
    public void inputInt() {
        try {
            System.out.println("请输入一个整数");
            String str = scanner.next();
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            inputInt();
        }
    }

    //无限循环+break
    public void inputInt2() {
        do {
            try {
                System.out.println("请输入一个整数");
                String str = scanner.next();
                int a = Integer.parseInt(str);
                //如果没有抛出异常就输出+break
                System.out.println(a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }
        } while (true);
    }
}
