package list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hex
 * @version 17
 */
//ArrayList允许放入任何值包括空值null
//ArrayList底层使用数组实现所以叫ArrayList
//ArrayList基本等同于Vector但是线程不安全,没有synchronized(线程互斥)修饰
public class ArrayListDetail {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(null);
        list.add(null);
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
