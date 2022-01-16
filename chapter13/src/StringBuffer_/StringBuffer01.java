package StringBuffer_;

import java.util.Scanner;

/**
 * @author Hex
 * @version 17
 */
//将输入内容转换成标准格式,每三位加一个小数点
public class StringBuffer01 {
    public static void main(String[] args) {
        System.out.println("请输入:");
        Scanner scanner = new Scanner(System.in);
        String price = scanner.next();
        StringBuffer sb = new StringBuffer(price);
        int indexofpoint = sb.lastIndexOf(".");
        while(indexofpoint>3) {
            sb=sb.insert(indexofpoint - 3,"," );
            indexofpoint-=3;
        }
        System.out.println(sb);
    }
}
