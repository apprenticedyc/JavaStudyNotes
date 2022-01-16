package collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hex
 * @version 17
 */
@SuppressWarnings({"all"})
public class ArrayList_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加单个元素
        list.add("jack");
        list.add(10);//相当于装了一个Integer对象进去
        list.add(true);
        System.out.println("list="+list);
        //按索引删除返回被删除的对象
        System.out.println("被删除的下标为1的元素是"+list.remove(1));
        //指定删除jack对象
        list.remove("jack");
        System.out.println("删除后\nlist="+list);
        //contains查找元素是否存在
        System.out.println(list.contains(true));
        //size返回元素个数
        System.out.println(list.size());
        //isEmpty判断是否为空
        System.out.println(list.isEmpty());
        //clear:清空元素
        list.clear();
        System.out.println(list);
        //addAll():参数为一个集合添加该集合中的多个元素到调用该方法的集合中
        ArrayList list2 = new ArrayList();
        list2.add("哈哈哈");
        list2.add("啦啦啦");
        list.addAll(list2);
        System.out.println(list);
        //containsAll()查找多个元素是否存在,也是传入一个list
        System.out.println(list.containsAll(list2));
        //removeAll()删除传入list所含所有元素(两者共有的删除)
        list2.add("夸夸夸");
        list.removeAll(list2);
        System.out.println(list);
    }
}
