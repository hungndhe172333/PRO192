
package src;

public class SpecCar extends Car {
    public int type;
    public SpecCar(){}
    
public SpecCar( String maker, int price, int type){
    Car newCar = new Car();
    newCar.maker = maker;
    newCar.price = price;
    this.type = type;
}
    @Override
    public String toString(){
    return maker + ", " + price + ", " + this.type; 
}
public void setData(String maker){
    this.maker = "XZ" + this.maker;
    this.price = this.price + 20;
}
public int getValue(){
    if ( this.type < 7 ){
        return this.price + 10;
    }
    if ( this.type > 7 ){
        return this.price + 15;
    }
        return 0;
}
}
