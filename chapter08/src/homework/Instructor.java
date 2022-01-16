package homework;

public class Instructor extends Professor {
    private double salary;


    public Instructor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary,grade);

    }



    @Override
    public String introduce() {
        return "instructor{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", post='" + getPost() + '\'' +
                ", salary=" + getSalary() *getGrade()+
                '}';
    }
}
