package homework;

import java.util.Scanner;

/**
 * @author Hex
 * @version 17
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("请输入用户名:");
            String userName = scanner.next();

            System.out.println("请输入密码:");
            String passWord = scanner.next();

            System.out.println("请输入邮箱:");
            String email = scanner.next();

        try {
            userRegister(userName,passWord,email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


/**
 * 单独写一个方法判断输入的是否全是数字
 */
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (!(Character.isDigit(aChar))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSix(String str){
        return str.length() == 6;
    }

    /**
     * 过关斩将校验用户输入
     *先写出正确条件再取反,再抛出异常
     */
    public static void userRegister(String usn,String pwd,String email){
        //第一关
        if (!(usn.length() < 5 && usn.length() > 1)) {
            throw new UsernameException("用户名长度为2到4");
        }

        //第二关
        if(!(isSix(pwd)&&isDigital(pwd))){
            throw new PassWordException("密码只能由6位数字构成");
        }

        //第三关

        int index01 = email.indexOf('@');
        int index02 = email.indexOf('.');
        if (!(index01>0&&index02>index01)) {
            throw new EmailException("邮箱需要包含 @ 和 . @在 . 的前面");
        }
    }
}

class UsernameException extends RuntimeException {
    public UsernameException(String message) {
        super(message);
    }
}

class PassWordException extends RuntimeException {
    public PassWordException(String message) {
        super(message);
    }
}

class EmailException extends RuntimeException {
    public EmailException(String message) {
        super(message);
    }
}
