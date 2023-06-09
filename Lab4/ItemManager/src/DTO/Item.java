package DTO;

import java.util.Scanner;

public class Item {

    public int value;
    public String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Item { " + "value = " + value + ", creator = " + creator + '}';
    }

    public void output() {
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter value: ");
                this.value = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Wrong input. Try again !");
                sc.nextLine();
            }
        }

        System.out.print("Enter creator: ");
        this.creator = sc.nextLine();
    }
}
