public class This01 {
    public static void main(String[] args) {
        Dog9 pupppy = new Dog9("xiaobai", 3);
        System.out.println("puppy hashcode=" + pupppy.hashCode());
        System.out.println(pupppy.name + "\n" + pupppy.age);
        T test = new T();//��Ӧ��һ��������
    }
}

class Dog9 {

    String name;
    int age;

    public Dog9(String name, int age) {
        //����������ԭ��,�������е�name(age)���Ǿֲ�����.��������.����Ҳ��û�и����Ը�ֵ
        //thisֻ�����ڷ�����
        //this.name���ǵ�ǰ����(���ø÷����Ķ���)������name �ұߵĻ��Ǿֲ�����
        //this�൱��һ�� ���� ָ������� ������
        //�ܶ���֮�ĸ��������,this�ʹ����ĸ�����
        this.name = name;
        System.out.println("this hashcode=" + this.hashCode());
        this.age = age;
    }

    //�����ϣ��
    //this hashcode=1324119927
    //puppy hashcode=1324119927
    //˵��this��ʵ����"��ַ"��һ����
    Dog9() {
    }
}
class T{
    public T(){

        //��this��������������
        //!!!this();���ҽ������ڹ��췽����!!!
        this("Andy",18);
        //������ʹ�������䲻�ڷ����ĵ�һ��ᱨ��:
        // 'this()' ���ñ����ǹ��캯�������еĵ�һ�����

        //����Ҫ��sout����this�������
        System.out.println("��һ��������");
    }
    public T(String name,int age){
        System.out.println("���ʵڶ���������");
    }
}
