package collection_;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Hex
 * @version 17
 */
public class Iterator_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List col = new ArrayList();
        col.add(new Book("哈哈", "拉了", 21.45));
        col.add(new Book("哈呼", "拉结", 22.45));
        col.add(new Book("哈哭", "拉尬", 23.45));
        //一次性输出  System.out.println(col);

        //用迭代器遍历输出
        //每个实现了Collection接口的子类必须实现Iterator方法,返回一个实现了Iterator接口的对象,即返回一个迭代器
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {//用hasNext判断是否还有数据
            //如果还有下一个数据就返回该数据,返回类型为Object(编译类型),运行类型看赋给next的到底是什么类型的数据
            Object next = iterator.next();
            System.out.println("obj =" + next);
        }
/**
 快捷键快速生成Iterator遍历方式: itit
 while (iterator.hasNext()) {
 Object next = iterator.next();
 */

        //当退出while循环后,这时迭代器指向最后的元素如果继续调用iterator.next会报异常
        //如果希望再次遍历,需要重置迭代器,将元素指针重新返回至开头
        iterator = col.iterator();

        //第二次遍历
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}


class Book {
    String author;
    String name;
    double sells;

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", sells=" + sells +
                '}';
    }

    public Book(String author, String name, double sells) {
        this.author = author;
        this.name = name;
        this.sells = sells;

    }
}