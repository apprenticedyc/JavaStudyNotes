package Integer_;

/**
 * @author Hex
 * @version 17
 */
public class Integer01 {
    public static void main(String[] args) {
        String b= "哈哈哈";
        String a = new String("哈哈哈");
        System.out.println(a==b);
        System.out.println(a==a.intern());
        System.out.println(a.hashCode());
        System.out.println(a.intern().hashCode());
        //a.intern()指向常量池中的地址
        //a指向堆中的一个对象的地址
        //两个地址不一样
        a.compareTo("Bitch");
    }

}
