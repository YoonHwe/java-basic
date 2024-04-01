package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args){
        //여러 상품의 주문정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[2];

        //상품 주문정보를 ProductOrder 타입의 변수로 받아 저장
        ProductOrder order1 = new ProductOrder();
        order1.productName = "농구공";
        order1.price = 2000;
        order1.quantity = 2;
        productOrders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "축구공";
        order2.price = 3000;
        order1.quantity = 3;
        productOrders[1] = order2;

        //상품 주문정보와 최종 금액 출력
        int totalPrice = 0;
        for(ProductOrder po : productOrders){
            totalPrice += po.price;
        }
        System.out.println("totalPrice : " + totalPrice);
    }
}
