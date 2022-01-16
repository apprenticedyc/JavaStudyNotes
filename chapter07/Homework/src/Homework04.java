public class Homework04 {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 5, 3, 3, 4, 3};
        A03 a03 = new A03();
        for (int i = 0; i <a.length; i++) {
            System.out.print(a03.copyArr(a)[i]+" ");
        }

    }
}

class A03 {

    public int[] copyArr(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
}