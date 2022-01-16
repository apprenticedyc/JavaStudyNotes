package homework;

/**
 * @author Hex
 * @version 17
 */
public class Homework01 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNUm());
        System.out.println(Frock.getNextNUm());

        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSerialNUmber());
        System.out.println(frock2.getSerialNUmber());
        System.out.println(frock3.getSerialNUmber());
    }
}


class Frock{
    static int currentNum=1000000;
private int serialNUmber;

    public static int getNextNUm(){
        currentNum+=100;
        return currentNum;
    }

    public int getSerialNUmber() {
        return serialNUmber;
    }

    public Frock() {
        this.serialNUmber = getNextNUm();
    }
}

