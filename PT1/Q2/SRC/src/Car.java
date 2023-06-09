
package src;

public class Car {
    public String maker;
    public int price;
    public Car(){}

    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return maker + ", " + price;
    }
    
}
