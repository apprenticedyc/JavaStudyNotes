public class AutoconvertDetail {
    public static void main(String[] args) {
        //多种数据类型混合运算时
        //系统首先自动将所有数据类型转换成容量最大的哪种数据类型,然后在计算

        int n1 = 10;
        float d1 = n1 + 1.1;//报错了.因为计算n1+1.1时自动将n1转化为了double型
        //计算结果 大于float型的精度,由高向低转化时有损失
        //解决方法:
        float d3 = n1 + 1.1f;
        float d2 = (float) (n1 + 1.1);


        //当把具体数赋给byte时,先判断该数是否在byte范围内-128~127,如果是就可以.
        byte a = 2;//是对的
        int n = 4;
        byte b = n;//如果使用变量赋值,因为变量已经分配空间了如n是四个字节,应该判断类型
        char m = n;//错误,原因byte 不能自动转化为 char.反之亦然

    }


}
