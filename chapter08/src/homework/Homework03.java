package homework;

public class Homework03 {
    public static void main(String[] args) {
        Teacher teacher = new Professor("smith",18,"教授",10000,1.3);
        //用的是子类构造器
        Professor professor = (Professor) teacher;
        System.out.println(professor.introduce());
    }

}





