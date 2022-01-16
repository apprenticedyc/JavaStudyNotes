package list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Hex
 * @version 17
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("斗破苍穹", 356, "天蚕土豆"));
        list.add(new Book("斗罗大陆", 234, "唐家三少"));
        list.add(new Book("转生史莱姆", 989, "立本人"));
        bubbleSort(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    public static void bubbleSort(List list) {
        Object temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                //先取出Book对象再进行比较
                //因为取出来的是一个Object对象 需要向下转型
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }


}

class Book {
    private String name;
    private double price;
    private String author;

    public double getPrice() {
        return price;
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}