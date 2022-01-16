package list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hex
 * @version 17
 */
public class List_ {
    public static void main(String[] args) {
        //实现了List接口的子类的元素添加顺序和取出顺序一致,且可重复
        List list = new ArrayList();
        list.add("哈哈哈");
        list.add("啦啦啦");
        list.add("花花花");
        list.add("卡卡卡");
        list.add("UZI");
        list.add("呱呱呱");
        list.add("啪啪啪");
        //List集合中的每个元素都有对应的索引,即支持索引(从0开始)取出:调用list.get(index)
        System.out.println(list.get(5));
    }
}
