public class Method02 {
    public static void main(String[] args) {
        Mytools tool = new Mytools();
        int[][] arr = {{1,2,3},{6,7,8}};
        tool.printArr(arr);
    }
}

//定义一个MyTools类把需要用的成员方法写进去
//好处:复用性高,可以将实现细节封装起来,供其他用户调用
class Mytools {
    public void printArr(int[][] array) {
        System.out.println("===");
        //对传入map数组进行遍历
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
