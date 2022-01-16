import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //化繁为简,先用面向过程实现:
    //1.第一部先完成显示菜单,并可以选择,给出对应提示信息


    public static void main(String[] args) {
        //定义相关变量
        boolean loop = true;//是否需要循环显示
        int i;//获取用户输入
//2.零钱通明细:简单的话可以用字符串拼接

//3.完成收益入账:定义新的变量
        double money;//收入金额
        double balance = 0;//余额
        Date date;//Date在javautil包下 显示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String details = "===========零钱通明细===========";

//4.完成消费:定义新的变量
        String note;//消费方式

//5.退出确定:定义新的变量
        String confirm;//用户确认

//while +break无限循环提示用户输入y或者n,输入正确才用break跳出
//退出while后再判断confirm是什么
//好处,低耦合,阅读方便,一段代码完成一个功能

//6.判断收益入账是否合理
//思路:找出不正确的金额,然后给出提示,直接break
//编程思想:[先分别找出不正确的,找到就返回]
        //[过关斩将]
// if(wrong){
// break;
// }这样比写正确条件简单得多,正确条件要排除所有错误条件,一句话要写一大段


//输出菜单界面
        do {
            System.out.println("===========零钱通菜单===========");
            System.out.println("\t1 零钱通明细");
            System.out.println("\t2 消费入账");
            System.out.println("\t3 消费");
            System.out.println("\t4 退      出");

            System.out.println("请选择(1-4):");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();


            //使用switch分支控制
            switch (i) {
                case 1:
                    System.out.println(details);
                    break;


                case 2:
                    System.out.print("2 收益入账金额:");
                    money = scanner.nextDouble();
                    //收入金额money范围应该校验一下


                    if (money <= 0) {
                        System.out.println("收益入账金额需要>=0");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    //获取当前时间
                    //然后把新的信息拼接到字符串后面
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case 3:
                    System.out.print("消费金额:");
                    money = scanner.nextDouble();
                    //同名变量可以多次用scanner赋值,值保留最后一次赋的值
                    if (money <= 0) {
                        System.out.println("消费金额不能为负数");
                        break;
                    }
                    if (money > balance) {
                        System.out.println("余额不足!");
                        break;
                    }
                    System.out.print("消费方式:");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    //重新获取当前时间
                    //然后把新的信息拼接到字符串后面
                    details += "\n" + note + "\t\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case 4:
                    while (true) {
                        System.out.println("您确定要退出吗?<y>---Yes<n>---No");
                        confirm = scanner.next();
                        if ("y".equals(confirm) || "n".equals(confirm)) {
                            break;
                        }
                    }
                    if ("y".equals(confirm)) {
                        loop = false;
                    }
                    //如果输入是n则不做处理
                    break;
                default:
                    System.out.println("你的输入有问题,请重新输入");
            }
        }
        while (loop);
        System.out.println("<您已成功退出>");
    }
}

