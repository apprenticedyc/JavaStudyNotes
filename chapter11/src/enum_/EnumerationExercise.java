package enum_;

/**
 * @author Hex
 * @version 17
 */
public class EnumerationExercise {
    public static void main(String[] args) {
        //values成员方法返回包含枚举类的所有枚举对象de数组
        Week[] weeks = Week.values();
        //增强for循环
        for (Week week :weeks ){
            System.out.println(week);
        }
    }
}
/**
 *枚举类
 */
enum Week{
MONDAY("周一"),TUESDAY("周二"),WEDNESDAY("周三"),
    THURSDAY("周四"),FRIDAY("周五"),SATURDAY("周六"),SUNDAY("周日");
    private final String name;

  Week(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}


