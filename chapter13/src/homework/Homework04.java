package homework;

import java.util.Scanner;

/**
 * @author Hex
 * @version 17
 */
public class Homework04 {
    public static void main(String[] args) {
        System.out.println("请输入:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        countStr(str);
    }

    public static void countStr(String str) {
        if (str == null) {
            System.out.println("输入不能为空");
            return;
        }
        char[] chars = str.toCharArray();
        int numCount = 0, upperCount = 0, lowerCount = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                numCount++;
            } else if ('a' <= c && c <= 'z') {
                lowerCount++;
            } else if ('A' <= c && c <= 'Z') {
                upperCount++;
            }
        }
        String format = String.format("数字有%d个大写字母有%d个小写字母有%d个"
                , numCount, upperCount, lowerCount);
        System.out.println(format);
    }
}
