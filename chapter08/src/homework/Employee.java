package homework;

public class Employee {
    private String name;
    private double salary;
    private int day;


    public Employee(double salsary, String name, int day) {
        this.salary = salsary;
        this.name = name;
        this.day = day;
    }

    public double getSalsary() {
        return salary;
    }

    public void setSalsary(double salsary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void printsalary(){
        System.out.println(salary);
    }
}













