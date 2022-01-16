package innnerclass;

public class InnerClassExercise02{
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //传递的是实现了Bell接口的匿名内部类
       //相当于
//      Bell bell = new Bell() {
//          @Override
//          public void ring() {
//              System.out.println("猪鼻起床了");
//          }
//      }
        //再将bell传递给形参
        //形参调用ring方法时发生了动态绑定,运行类型是实现了接口的匿名对象
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("猪鼻起床了");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });
    }
}

interface Bell{
    void ring();
}

class Cellphone{
    public void alarmclock(Bell bell){
        bell.ring();
    }

}


