package GUI;

import java.util.Scanner;
import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;

public class AntiqueShop {

    public static void main(String[] args) {
        String[] options = {"Create a Vase", "Create a Statue",
            "Create a Statue", "Display the item"};
        Scanner sc = new Scanner(System.in);
        int choice;
        Item item = null;
        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputState();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("No data in item. You need create an obj");
                    }
                    break;
            }
        } while (choice < 4);
    }
}
