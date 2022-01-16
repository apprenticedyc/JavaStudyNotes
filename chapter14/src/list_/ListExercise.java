package list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Hex
 * @version 17
 */
public class ListExercise {
    public static void main(String[] args) {
        List list= new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello"+i);
        }
        System.out.println(list.get(4));
        list.set(6,"修改了");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
