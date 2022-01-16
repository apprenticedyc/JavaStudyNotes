package abstract_.exercise;

public class CommonWorker extends Employee{
    public CommonWorker(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("员工"+getName()+"正在工作");
    }
}
