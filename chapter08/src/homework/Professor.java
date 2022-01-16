package homework;

public class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public String introduce() {
        return "professor{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", post='" + getPost() + '\'' +
                ", salary=" + getSalary()*getGrade() +
                '}';
        //除了getSalary,剩下的get属性用的都是父类的,因为子类professor没有上面三个get方法,只有一个getSalary
    }
}
