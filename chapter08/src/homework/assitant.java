package homework;

public class assitant extends Professor{

    public assitant(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary,grade);

    }



    @Override
    public String introduce() {
        return  "assitant{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", post='" + getPost() + '\'' +
                ", salary=" + getSalary() *getGrade()+
                '}';
    }
}
