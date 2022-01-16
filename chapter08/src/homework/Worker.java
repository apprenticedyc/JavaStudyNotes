package homework;

public class Worker extends Employee{
    public Worker( String name,double salary, int day) {
        super(salary, name, day);
    }

    @Override
    public void printsalary() {
        System.out.println("员工"+getName()+"工资是"+ getSalsary()*getDay()*1.0);
    }
}
