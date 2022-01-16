package collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hex
 * @version 17
 */
public class CollectionFor {
    public static void main(String[] args) {

        List col = new ArrayList();
        col.add(new Book("哈哈", "拉了", 21.45));
        col.add(new Book("哈呼", "拉结", 22.45));
        col.add(new Book("哈哭", "拉尬", 23.45));

// 增强for就是简化版的iterator
// 运行到增强for时底层会调用iterator方法返回一个迭代器
// 再通过hasNext 和next遍历, 原理就是迭代器
// 快捷方式大写I

        for (Object book : col
        ) {
            System.out.println("book="+book);

        }
    }
}
