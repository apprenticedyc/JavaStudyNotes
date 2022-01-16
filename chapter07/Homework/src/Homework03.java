import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book = new Book();
        System.out.println("请输入书本价格");
        book.price = input.nextInt();
        book.upadate();
        System.out.println("书的价格是" + book.price);
    }
}

class Book {
    int price;

    public void upadate() {
        if (this.price > 150 ) {
            this.price = 150;
        }
        else if (this.price > 100) {
            this.price = 100;
        }
    }
}