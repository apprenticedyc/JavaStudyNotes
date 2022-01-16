package innnerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
    //匿名内部类可以当做实参直接传递

        f1(new AA() {
            @Override
            public void show() {
                System.out.println("阿梓你带我走吧");
            }
        });
       /* 传统方式 :需要专门写一个类 [硬编码]
       而且原来的类修改之后,所有的对象实例都会受到影响
        class AA2 implements AA{
            @Override
            public void show() {
                System.out.println("阿梓你带我走吧");
            }
        }
        f1(new AA2());
        */
    }

    public static void f1(AA aa) {
        aa.show();
    }

}

interface AA {
    public void show();
}