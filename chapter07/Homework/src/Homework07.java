public class Homework07 {
    public static void main(String[] args) {

    }
}

class Employee {
    String name;
    char gender;
    int age;
    String job;
    double sal;

    public Employee(String job, double sal) {
        //复用构造器,先写属性少的
        //职位 薪水
        this.job = job;
        this.sal = sal;
    }

    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String job, double sal, String name, char gender, int age) {
        //构造器复用:this()  !!!!这种写法只能用在构造器中
        this(name, gender, age);//使用了前面的构造器
        //但是只能用一次this()因为必须放在第一条!!!
        this.job = job;
        this.sal = sal;
    }
}