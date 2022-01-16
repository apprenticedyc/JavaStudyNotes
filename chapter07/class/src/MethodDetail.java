public class MethodDetail {
    public static void main(String[] args) {
        AA aa = new AA();
        int[] bb = aa.getSumAndSub(1, 3);
        for (int i = 0; i < bb.length; i++) {
            System.out.println(bb[i]);
        }
    }
}

//如果要求方法有多个返回值可以已返回数组
class AA {
    public int[] getSumAndSub(int n1, int n2) {
        int[] res = new int[2];
        res[0] = n1 + n2;
        res[1] = n1 - n2;
        return res;
        //返回值类型必须和return的值类型一致或兼容(低精度到高精度)
        //方法要求返回double,return int是可以的int -> double(yes)
    }   //double -> int 是不行的
        // 传参时也使用上述规则
}