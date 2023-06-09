package DTO;

import java.util.Scanner;

public class Painting extends Item {

    public int height;
    public int width;
    public boolean isWatercolour;
    public boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    @Override
    public String toString() {
        return "Painting{" + "height=" + height + ", width=" + width + ", isWatercolour=" + isWatercolour + ", isFramed=" + isFramed + '}';
    }

    public void outputPainting() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Is watercolour: " + this.isWatercolour);
        System.out.println("Is framed: " + this.isFramed);
    }

    public void inputPainting() {
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
        while (true) {
            try {
                System.out.print("Enter width: ");
                this.width = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Wrong input, try again!");
                sc.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Is Watercolour: ");
                this.isWatercolour = sc.nextBoolean();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Wrong input, try again!");
                sc.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Is Framed: ");
                this.isFramed = sc.nextBoolean();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Wrong input, try again!");
                sc.nextLine();
            }
        }
    }
}
