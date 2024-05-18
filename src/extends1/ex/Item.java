package extends1.ex;

public class Item {
    String name;
    int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.print("[" + this.name + " / " + this.price + "]");
    }

    public int getPrice(){
        return this.price;
    }
}
