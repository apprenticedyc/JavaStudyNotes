package innnerclass;

public class InnerClass02 {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.method();
    }
}

class Outer02 {
    private int n1=100;

    public void method() {
        //基于类的匿名内部类
        Father father = new Father("hahaha") {
            int n1=200;

            @Override
            public void test() {
                System.out.println("内部类重写了方法,哈哈哈");
            }


            @Override
            public void N1(){
                System.out.println("内部类n1="+n1);
                System.out.println("外部类n1="+Outer02.this.n1);
            }
        };

        father.test();
        father.N1();
        //为什么匿名内部类不能调用自己的特有方法?
        //因为匿名内部类继承了父类Father,如果要调用特殊方法那么需要向下转型
        //又因为子类类名不存在或者说无法使用所以匿名内部类不能使用自己的特殊方法



        //也可以直接调用,因为匿名内部类本身就是一个对象,所以直接 .调用方法也是可以的
        new Father("lalala") {
            @Override
            public void test() {
                System.out.println("内部类重写了方法,啦啦啦");
            }

            @Override
            public void ok(String name) {
                super.ok(name);
            }
        }.ok("啦啦啦");
    }

}


class Father {
    public Father(String name) {
    }

    public void ok(String name) {
        System.out.println(name+"很棒棒");
    }
    public void N1(){

    }

    public void test() {
    }
}
