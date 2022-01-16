package Test;

import java.lang.ref.PhantomReference;

public class Test {
    public static void main(String[] args) {


        BB bb = new BB("woshanima");
        System.out.println(new AA().name);
    }
}

class AA {

    String name = "haha";

    public AA() {
    }

    public AA(String name) {

        this.name = name;
    }

}