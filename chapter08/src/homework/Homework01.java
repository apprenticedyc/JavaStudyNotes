package homework;

import java.util.Scanner;

/**
 * @author Hex
 */
public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] arr = new Person[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + (i + 1) + "]name: age: job:");
            arr[i] = new Person(scanner.next(), scanner.nextInt(), scanner.next());
        }

        Homework01 test = new Homework01();
        test.sort(arr);
        test.output(arr);
    }

    public void sort(Person[] person) {
        Person temp;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1; j++) {
                if (person[i].getAge() > person[i + 1].getAge()) {
                    temp = person[i];
                    person[i] = person[i + 1];
                    person[i + 1] = temp;
                }
            }
        }
    }

    public void output(Person[] person) {
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].info());
        }
    }

}
