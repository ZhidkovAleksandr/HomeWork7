package Task3;

public class Price {
    private String namePoduct;
    private String nameStore;
    private int price;

    public Price(String namePoduct, String nameStore, int price){
        this.namePoduct = namePoduct;
        this.nameStore  = nameStore;
        this.price      = price;
    }

    public String getNamePoduct() {
        return namePoduct;
    }

    public String getNameStore() {
        return nameStore;
    }

    public int getPrice() {
        return price;
    }
}
