
package src;
import java.util.*;

public class Book {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    BookInfo book1 = new BookInfo();
    System.out.print("Enter title: ");
    book1.title = sc.nextLine();
    System.out.print("Enter price: ");
    book1.price = sc.nextInt();
    System.out.println("1. Test getTitle()");
    System.out.println("2. Test setPrice()");
    System.out.print("Enter TC ( 1 or 2 ): ");
    int choice = sc.nextInt();
    if ( choice == 1 ){
        System.out.println("OUTPUT:");
        System.out.println(book1.getTitle());
    }
    if ( choice == 2 ){
        System.out.print("Enter the new price: ");
        int newPrice = sc.nextInt();
        book1.setPrice(newPrice);
        System.out.println("OUTPUT:");
        System.out.println(book1.getPrice());
    }
}
}
