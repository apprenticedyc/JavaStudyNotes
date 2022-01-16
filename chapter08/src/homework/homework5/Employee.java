package homework.homework5;

public class Employee {
    private double sal;//基本工资
    private String name;

    public Employee(double sal, String name) {
        this.sal = sal;
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void outputsal(){
        System.out.println(sal);
    }
}
