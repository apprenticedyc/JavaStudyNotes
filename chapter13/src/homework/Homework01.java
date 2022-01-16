package homework;

/**
 * @author Hex
 * @version 17
 */
//字符串翻转

/**
 * 思路:先把String转换成char[]数组,利用t0charArray方法
 */
public class Homework01 {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        String str=reverse(s1, 1, 3);
        System.out.println(str);
    }

    public static String reverse(String str, int start, int end) {
        char[] chars = str.toCharArray();
        char temp =' ';
        if(! (str!=null&&start>0&&end<chars.length)){
            return "你输入的有误";
        }
        for (int i = start, j=end; i<j;i++,j--) {
           temp = chars[i];
           chars[i]=chars[j];
           chars[j]=temp;
        }
        return new String(chars);
    }

}
