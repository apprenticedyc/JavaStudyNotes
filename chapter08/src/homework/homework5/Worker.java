package homework.homework5;

public class Worker extends Employee{
    public Worker(double sal, String name) {
        super(sal, name);
    }
    //工人没有其他收入

    @Override
    public void outputsal() {
        super.outputsal();
    }
}
