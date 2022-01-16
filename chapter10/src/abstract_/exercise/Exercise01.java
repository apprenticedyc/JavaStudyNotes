package abstract_.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        CommonWorker Andy = new CommonWorker("哈哈哈", 34, 12345);
        Manager chenrui = new Manager("啦啦啦", 45, 123456, 124567);
        Andy.work();
        chenrui.work();
    }
}
