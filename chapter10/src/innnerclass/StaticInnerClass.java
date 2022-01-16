package innnerclass;

public class StaticInnerClass {
    public static void main(String[] args) {
        //方法 1
        //因为静态内部类，是可以通过类名直接访问(前提是满足访问权限)
        Outer04.Inner04 inner04 = new Outer04.Inner04();
        //方式 2
        //编写一个方法，可以返回静态内部类的对象实例.
        Outer04.Inner04 inner05 = Outer04.getInner04();
        inner05.say();
    }
}
//1. 放在外部类的成员位置
// 2. 使用 static 修饰
// 3. 可以直接访问外部类的所有{静态成员}，包含私有的，但不能直接访问非静态成员
// 4. 可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员
// 5. 作用域 ：同其他的成员，为整个类体
class Outer04 {
   static private int n1 = 100;

    static class Inner04 {
        //如果外部类和静态内部类的成员重名时，静态内部类访问的时候
        //默认遵循就近原则，如果想访问外部类的成员，则可以使用 （外部类名.成员）
        // 因为只能访问静态成员所以只需要外部类名不需要外部类名.this这样的对象实例来调用
        private static int n1 = 200;

        public void say() {
            System.out.println("内部类N1=" + n1);
            System.out.println("外部类N1=" + Outer04.n1);
        }

    }

    static public Inner04 getInner04() {
        return new Inner04();
    }

}