public class Homework06 {
    public static void main(String[] args) {
        Cale cale = new Cale(1, 5);
        System.out.println("和=" + cale.add());
        System.out.println("差=" + cale.minus());
        System.out.println("积=" + cale.product());
        if (cale.div() != null) {
            System.out.println("商=" + cale.div());
        } else {
            System.out.println("除数不能为0");
        }
    }
}

class Cale {
    int a;
    int b;

    public Cale(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int minus() {
        return a - b;
    }

    public int product() {
        return a * b;
    }

    public Double div() {
        if (b == 0) {
            System.out.println("不能为0请重新输入");
            return null;
            //返回值没有结果时返回"空"在包装类Double Int....中
        }
        return (double) a / b;
    }
}