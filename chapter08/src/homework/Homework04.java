package homework;

public class Homework04 {
    public static void main(String[] args) {
        Worker worker = new Worker("andy", 1000, 30);
        worker.printsalary();
        Manager manager = new Manager(1000, "bitch", 30);
        //设置奖金
        manager.setBonus(1000);
        manager.printsalary();
    }
}
