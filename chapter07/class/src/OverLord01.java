public class OverLord01 {
    public static void main(String[] args) {
Mycalculator mc=new Mycalculator();
        System.out.println(mc.calculate(12,34));
        System.out.println(mc.calculate(1.2,34));
        System.out.println(mc.calculate(12,3.4));
        System.out.println(mc.calculate(12,34,56));
    }
}

class Mycalculator {

    //方法重载,方法名必须相同,形参列表必须不同(形参类型 个数 顺序至少一个不一样)
    // 形参名字无所谓,类型 个数 顺序都相同,参数名不同属于方法的重复定义,不是重载
    //返回类型无所谓,返回类型不是构成方法重载的条件,比如一个返回void一个返回int属于重复定义
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }

    public double calculate(int n1, double n2) {
        return n1 + n2;
    }

    public double calculate(double n2, int n1) {
        return n1 + n2;
    }

    public int calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

}
