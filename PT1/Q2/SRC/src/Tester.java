
package src;
import java.util.*;
public class Tester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SpecCar newCar = new SpecCar();
        System.out.print("Enter maker: ");
        newCar.maker = sc.nextLine();
        System.out.print("Enter price: ");
        newCar.price = sc.nextInt();
        System.out.print("Enter type: ");
        newCar.type = sc.nextInt();
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue");
        System.out.print("Enter ur choice: ");
        int choice = sc.nextInt();
        if ( choice == 1 ){
            System.out.println("OUTPUT: ");
            Car car = new Car(newCar.maker, newCar.price);
            System.out.println(car.toString());
            System.out.println(newCar.toString());
        }
        if ( choice == 2 ){
            System.out.println("OUTPUT: ");            
            newCar.setData(newCar.maker);
            System.out.println(newCar.getMaker() + ", " + newCar.getPrice());
        }
        if ( choice == 3 ){
            System.out.println("OUTPUT: ");            
            System.out.println(newCar.getValue());
        }
}
    
}
