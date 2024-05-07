package access.ex;

public class Item {
    private String name;
    private int price;
    private int amount;

    public Item(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void displayItem() {
        System.out.println("상품명:" + this.name + ", 합계:" + this.price * this.amount);
    }
    int getPrice(){
        return this.price*this.amount;
    }
}
