package DTO;

import java.util.Scanner;

public class Statue extends Item {

    public int weight;
    public String colour;

    public Statue() {
    }

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Statue{" + "weight=" + weight + ", colour=" + colour + '}';
    }

    public void inputStatue() {
        Scanner sc = new Scanner(System.in);

        super.input();

        while (true) {
            try {
                System.out.print("Enter weight: ");
                this.weight = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Wrong input, try again!");
                sc.nextLine();
            }
        }

        System.out.print("Enter colour: ");
        this.colour = sc.nextLine();
    }

    public void outputState() {
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
}
