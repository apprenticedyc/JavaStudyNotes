public class AutoConvert {
    public static void main(String[] args) {
        //在java中低精度数据类型可以自动转化为高精度数据类型
        //其中精度大小
        // char<int<long<float<double
        //byte<short<int<long<float<double
        //byte/short和char之间不发生自动类型转换
        //演示自动转换:
        int a = 'A';
        double d1 = 89;
        System.out.println(a);
        System.out.println(d1);
    }
}
