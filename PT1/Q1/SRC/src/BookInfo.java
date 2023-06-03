package src;

public class BookInfo { 
    public String title;
    public int price;
    
    public BookInfo(){
    }

    public BookInfo(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
