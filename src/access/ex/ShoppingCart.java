package access.ex;

public class ShoppingCart {
    Item[] cart;
    int index;
    public ShoppingCart(){
        this.cart = new Item[10];
        index = 0;
    }

    //addItem
    public void addItem(Item item){
        cart[index] = item;
        index++;
    }

    private boolean isCartFull(){
        if(index >= 10){
            System.out.println("장바구니가 가득 찼습니다.");
            return false;
        }
        return true;
    }

    private int getTotalPrice(){
        int totalPrice = 0;
        for(int i = 0; i < index; i++){
            totalPrice += cart[i].getPrice();
        }
        return totalPrice;
    }
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < index; i++){
            cart[i].displayItem();
        }
        System.out.println("전체 가격 : " + getTotalPrice());
    }


}
