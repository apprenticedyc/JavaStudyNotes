public class Method {
    public static void main(String[] args) {
        new Person();
        Person ��ԣ�� = new Person();
        ��ԣ��.speak();//���÷���
        System.out.println(��ԣ��.cal01());
        ��ԣ��.cal02(10);//����cal02,ͬʱ��n��ֵ5
        System.out.println(��ԣ��.getSum(19,80));
    }
}

class Person {
    String name;
    int age;

    //speak�Ƿ�����
    //()���β��б�
    //{}�Ƿ�����,д����Ҫִ�еĴ���
    public void speak() {
        System.out.println("����һ��Сѧ��");
    }

    //���һ��cal01����,���Դ�1+....+100�Ľ��
    public int cal01() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        return sum;
    }

    //���һ��cal02��Ա����,�÷������Խ���һ��n,�����1+....+n��ֵ
    //(int n)���β��б�,��ʾ��ǰ��һ������ n ,���Խ����û�����
    public void cal02(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("��������" + sum);
    }

    //���getsum��Ա����.�����������ĺ�
    public int getSum(int n, int m) {
        int res = m + n;
        return res;
    }
}