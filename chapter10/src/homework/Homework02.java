package homework;

import java.util.Scanner;

/**
 * @author Hex
 * @version 17
 */
public class Homework02 {
    public static void main(String[] args) {
        Person person1 = new Person("唐僧", new Horse());
        person1.common();
        person1.passRiver();
        person1.passHill();
    }
}

interface Vehicle {
    public void work();
}

class Horse implements Vehicle {
    @Override
    public void work() {
        System.out.println("使用马儿");
    }
}

class Boat implements Vehicle {
    @Override
    public void work() {
        System.out.println("使用小船");
    }
}

class Plane implements Vehicle {
    @Override
    public void work() {
        System.out.println("坐飞机");
    }
}

//只需要调用工厂类的方法,可以将方法做成static
class Factory {
    private Factory() {
    }

    //饿汉式单例模式 马始终是同一个
    private static Horse horse = new Horse();

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}

class Person {
    private String name;
    private Vehicle vehicle;

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    //将具体要求封装成方法体现OOP编程思想
    public void passRiver() {
        //先判断一下当前对象vehicle是否已经存在
        if (!(vehicle instanceof Boat)) {
            vehicle = Factory.getBoat();//用接口接收实现了他的对象体现多态
            //不用定义对应的Boat或者Horse去接收
        }
        vehicle.work();
    }

    public void common() {
        if (!(vehicle instanceof Horse)) {
            vehicle = Factory.getHorse();
        }
        vehicle.work();
    }

    public void passHill() {
        if(!(vehicle instanceof Plane)){
            vehicle = Factory.getPlane();
        }
        vehicle.work();
    }
}
