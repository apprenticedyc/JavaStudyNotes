package interface_;

public class Interface01 {
    public static void main(String[] args) {

    }
}
//如果一个类implements一个接口则需要把这个接口的所有抽象方法全部实现
class A implements InterfaceA {
    @Override
    public void hi() {
        System.out.println("嗨,你好!");
    }
}