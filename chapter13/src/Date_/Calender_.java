package Date_;

import java.util.Calendar;

/**
 * @author Hex
 * @version 17
 */
public class Calender_ {
    public static void main(String[] args) {
//Calendar是一个抽象类,构造器时private不能实例化但是提供了getInstance来获取实例
        //Calendar没有提供对应的格式化的类,因此需要程序员自己组合
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH)+1);//Calendar返回月时从0开始编号,所以要加1
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.HOUR_OF_DAY));
        System.out.println(instance.get(Calendar.MINUTE));
        System.out.println(instance.get(Calendar.SECOND));

    }
}
