public class MethodExercise02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Andy";
        p.age = 18;
        Mytools01 tools = new Mytools01();
        Person p2 = tools.copyPerson(p);
        System.out.println(p2.age+"\n"+p2.name);
    }
}

class Person01 {
    String name;
    int age;
}

class Mytools01 {
    //编写一个方法copyperson,可以复制一个Person对象,返回复制的对象.
    //新对象和原来的对象是两个独立的对象,只是属性相同
    //方法的形参(需要复制的对象 Person p)
    //方法体,创建一个新对象,并复制属性,返回即可
    public Person copyPerson(Person p) {
        //先创建一个对象
        Person p2 = new Person();
        //把原来对象的属性复制给p2
        p2.age = p.age;
        p2.name = p.name;
        return p2;
    }
}