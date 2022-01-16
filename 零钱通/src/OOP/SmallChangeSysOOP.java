package OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 使用OOP完成零钱通系统
 * 将各个功能对应一个方法(封装)
 */
public class SmallChangeSysOOP {
    //属性
    boolean loop = true;//是否需要循环显示
    int i;//获取用户输入
    double money;//收入 or 支出
    double balance = 0;//余额
    Date date;//当前日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String details = "===========零钱通明细===========";
    String note;//消费方式
    String confirm;//用户确认是否退出
    Scanner scanner = new Scanner(System.in);


    public void mainMenu() {
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
                    this.details();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.pay();
                    break;
                case 4:
                    this.exit();
                    break;
                default:
                    System.out.println("你的输入有问题,请重新输入");
            }
        }
        while (loop);
    }

    public void details() {
        System.out.println(details);
    }

    public void income() {
        System.out.print("2 收益入账金额:");
        money = scanner.nextDouble();
        //收入金额money范围应该校验一下

        if (money <= 0) {
            System.out.println("收益入账金额需要>=0");
            // [退出方法不再执行后面的代码用return;]
            return;
        }
        balance += money;
        date = new Date();
        //获取当前时间
        //然后把新的信息拼接到字符串后面
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void pay() {
        System.out.print("消费金额:");
        money = scanner.nextDouble();//同名变量可以多次用scanner赋值,值保留最后一次赋的值
        if (money <= 0) {
            System.out.println("收益入账金额需要>=0");
            // [退出方法不再执行后面的代码用return;]
            return;
        }
        if (money > balance) {
            System.out.println("余额不足");
            // [退出方法不再执行后面的代码用return;]
            return;
        }
        System.out.print("消费方式:");
        note = scanner.next();
        balance -= money;
        date = new Date();
        //重新获取当前时间
        //然后把新的信息拼接到字符串后面
        details += "\n" + note + "\t\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit() {
        while (true) {
            System.out.println("您确定要退出吗?<y>---Yes<n>---No");
            confirm = scanner.next();
            if ("y".equals(confirm) || "n".equals(confirm)) {
                break;
            }
        }
        if ("y".equals(confirm)) {
            System.out.println("<退出成功>");
            loop = false;
        }
        //如果输入是n则不做处理
    }


}
