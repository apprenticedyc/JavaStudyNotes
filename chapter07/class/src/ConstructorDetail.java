public class ConstructorDetail {
    public static void main(String[] args) {
        Person2 wife1 = new Person2("liuyan", 30);//ʹ�õ�һ��������
        Person2 wife2 = new Person2("liutao");//ʹ�õڶ���������
        Person2 wife3;
        wife3 =new Person2("yangmi");
        Dog dog = new Dog();

    }
}

//һ��������ж����ͬ�Ĺ�����,������������
class Person2 {
    String name;
    int age;

    //��һ��������
    public Person2(String pName, int pAge) {
        System.out.println("���������ɹ�����");
        name = pName;
        age = pAge;
    }

    //�ڶ���������,ָֻ������
    //������������������һ��Ҫ��ͬ,������Ϊ��Ա����
    //����������ɶ����ʼ��,�����Ǵ�������
    //������������ϵͳ��������ʱ�Զ����ò�����������
    //�������Աû�ж��幹����,ϵͳ���Զ���������һ���޲ι�����(Ҳ��Ĭ�Ϲ�����)

    public Person2(String pName) {
        name = pName;
    }
    /*��javap���������ʾĬ�Ϲ�����Dog();*/

}
class Dog{
    public Dog(String name$) {

    }
    //һ���������Լ��Ĺ�����,Ĭ�ϵĹ������ͱ�������,!!!�Ͳ�����ʹ��Ĭ�Ϲ�������!!!
    //������ʾ�Ķ���һ�¼�Dog(){}
    Dog(){}
}