public class Constructor {
    public static void main(String[] args) {
        //������newһ������ʱ,ֱ��ͨ��������ָ��(��ʼ��)���ֺ�����
Person1 p1=new Person1("smith",80);
        System.out.println(p1.age);
        System.out.println(p1.name);
    }
}

class Person1 {
    String name;
    int age;

        //������û�з���ֵҲ����дvoid
    public Person1(String pName, int pAge) {
        //���췽��������������һ��
        //(String pName, int pAge)�ǹ������β��б����ͳ�Ա����һ��
        System.out.println("���������ɹ�����");
        name = pName;
        age = pAge;
    }
}
