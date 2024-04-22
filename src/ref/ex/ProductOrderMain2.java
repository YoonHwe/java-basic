package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args){
        //여러 상품의 주문정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[2];

        //상품 주문정보를 ProductOrder 타입의 변수로 받아 저장
        ProductOrder order1 = createProductOrder("농구공", 2000, 3);

        ProductOrder order2 = createProductOrder("축구공", 3000, 2);

        productOrders[0] = order1; productOrders[1] = order2;
        //상품 주문정보와 최종 금액 출력

        printOrders(productOrders);

        System.out.println("총 가격 : " + getTotalPrice(productOrders));
    }
    static ProductOrder createProductOrder(String productName, int price, int quantity){
        ProductOrder po = new ProductOrder();
        po.productName = productName;
        po.price = price;
        po.quantity = quantity;

        return po;
    }

    static void printOrders(ProductOrder[] productOrders){
        for(ProductOrder po : productOrders){
            System.out.println("상품명 : " + po.productName + ", 가격 : " + po.price+", 수량 : " + po.quantity);
        }
    }

    static int getTotalPrice(ProductOrder[] productOrders){
        int totalPrice = 0;
        for(ProductOrder po : productOrders){
            totalPrice += po.price * po.quantity;
        }
        return totalPrice;
    }
}
