public class Method {
    public static void main(String[] args) {
        new Person();
        Person 邓裕澄 = new Person();
        邓裕澄.speak();//调用方法
        System.out.println(邓裕澄.cal01());
        邓裕澄.cal02(10);//调用cal02,同时给n赋值5
        System.out.println(邓裕澄.getSum(19,80));
    }
}

class Person {
    String name;
    int age;

    //speak是方法名
    //()是形参列表
    //{}是方法体,写我们要执行的代码
    public void speak() {
        System.out.println("我是一个小学生");
    }

    //添加一个cal01方法,可以从1+....+100的结果
    public int cal01() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        return sum;
    }

    //添加一个cal02成员方法,该方法可以接受一个n,计算从1+....+n的值
    //(int n)是形参列表,表示当前有一个参数 n ,可以接受用户输入
    public void cal02(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("计算结果是" + sum);
    }

    //添加getsum成员方法.计算两个数的和
    public int getSum(int n, int m) {
        int res = m + n;
        return res;
    }
}