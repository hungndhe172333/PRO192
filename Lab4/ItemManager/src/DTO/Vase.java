package DTO;

import java.util.Scanner;

public class Vase extends Item {

    public int height;
    public String material;

    public Vase() {
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Vase{" + "height=" + height + ", material=" + material + '}';
    }

    public void outputVase() {
        System.out.println("Height: " + this.height);
        System.out.println("Material: " + this.material);
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }

    public void inputVase() {
        Scanner sc = new Scanner(System.in);

        super.input();

        while (true) {
            try {
                System.out.print("Enter height: ");
                this.height = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Wrong input, try again!");
                sc.nextLine();
            }
        }

        System.out.print("Enter material: ");
        this.material = sc.nextLine();
    }
}
