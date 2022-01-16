package com.dyc.poly.polyarr;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class PolyArr {


    public static void main(String[] args) {
        //多态数组
        //创建一个数组接受两个Teacher两个Student,并调用对象say方法
        //可以用父类数组接收,父类引用可以指向子类对象(向上转型)
        //并且运行时按照子类（运行类型）调用方法［动态绑定机制］


        Person[] person = new Person[6];
        person[0] = new Person(18, "jack");
        person[1] = new Student(18, "Mary", 100);
        person[2] = new Student(18, "Linda", 100);
        person[3] = new Teacher(26, "Yishiwala", 10000);
        person[4] = new Teacher(25, "Yuri", 10000);

        //循环遍历多态数组,调用say方法
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());//接下来调用子类特殊方法[向下转型]
            if (person[i] instanceof Student) {
                Student student = (Student) person[i];//向下转型
                student.study();
                //也可以一条语句

                //((Student)person[i]).study(); 转完直接调用,自动生成一个对象
            } else if (person[i] instanceof Teacher) {
                Teacher teacher = (Teacher) person[i];
                teacher.teach();

            } else if (person[i] instanceof Person) {

            } else {
                System.out.println("你的类型有误,请检查");
            }
        }
    }

}
