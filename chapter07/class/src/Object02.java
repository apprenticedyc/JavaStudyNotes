/**
 * @author DYC666
 * @version JDK1.17
 */
public class Object02 {
    public static void main(String[] args) {
        //����һ������
        //���� + ������ = new ���췽����
        Car car1= new Car();
        //cat1���������Ķ���,��Ϊ����������(��������)������һ��"ָ��"�����ջ�ڴ���ָ�������Ķ���
        //�����Ķ�����new Car() ͨ��new�����Ķ���ռ�(����)
        //����������Ĭ��ֵ,�����������Ĭ��ֵ����
        //int 0��short 0, byte 0, long 0, float 0.0,double 0.0��char \u0000��boolean false��String null
        System.out.println(car1.color+"\n"+car1.name+"\n"+car1.price+"\n" +car1.master+"\n"+car1.ischecked+"\n");
    }

}
class Car {
    String name;
    double price;
    String color;
    String[] master;
    boolean ischecked;
    //���Կ����ǻ�����������,Ҳ������������������:
    //���������Ķ����������
}