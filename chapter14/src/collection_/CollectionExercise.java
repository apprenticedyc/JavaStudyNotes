package collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Hex
 * @version 17
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List col = new ArrayList();
        col.add(new Dog("Uzi", 25));
        col.add(new Dog("炫狗", 25));
        col.add(new Dog("哈皮", 26));
        Iterator iterator = col.iterator();
        //快捷键itit
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //快捷键iter
        for (Object o : col) {
            System.out.println(o);
        }
    }
}

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}