package use;

import java.util.SortedMap;

public class Encapsulation {
    public static void main(String[] args) {
        Person andy = new Person("Andy", 18, 50000);
        System.out.println(andy.info());
    }

}

class Person {
    public String name;
    private int age;
    private double salary;

//构造器快捷键alt+insert

    public Person() {
    }

    //有三个属性的构造器
    //如果直接用构造器指定属性,则绕过了settler和getter,无法验证数据是否合理
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        //解决方法:可以将set方法和get方法写在构造器中,这样仍然可以验证
        //Example:
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验,相当于增加了业务逻辑
        if (name.length() >= 2 && name.length() <= 3) {
            this.name = name;
        } else {
            System.out.println("请重新输入名字");
            this.name = "名字有误";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 35) {
            this.age = age;
        }else{
            System.out.println("年龄有误,请重新输入");
            this.age=000;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public  String info(){
        return "年龄:"+age+"  名字:"+name+"  薪水:"+salary;
    }
}


