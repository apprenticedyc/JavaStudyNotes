package enum_;

/**
 * @author Hex
 * @version 17
 */

public class Enumration02 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}

class Season{
    private String name;
    private String desc;
//自定义枚举类
//第一步:构造器私有化
//第二步:去掉set方法,只可读不可改
//第三步:创建固定对象对外暴露public final satic 枚举对象不可修改且能直接访问,final修饰的常量全部大写
    public  static final Season SPRING =new Season("春天", "温暖");
    public  static final Season SUMMER =new Season("夏天", "炎热");
    public  static final Season AUTUMN =new Season("秋天", "凉爽");
    public  static final Season WINTER =new Season("冬天", "寒冷");


    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

