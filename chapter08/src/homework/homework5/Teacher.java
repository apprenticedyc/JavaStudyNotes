package homework.homework5;

public class Teacher extends Employee {
    private int classDay;
    private int classSal;

    public Teacher(double sal, String name, int classDay, int classSal) {
        super(sal, name);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public void printsal() {
        System.out.println( getName()+(getSal()+classDay*classSal)   );
    }


}
