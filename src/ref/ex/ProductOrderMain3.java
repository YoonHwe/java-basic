package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 주문 수량 입력
        int amount = sc.nextInt();
        //여러 상품의 주문정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[amount];

        //상품 주문정보를 ProductOrder 타입의 변수로 받아 저장
        for(int i = 0 ; i < amount; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = sc.next();
            System.out.print("가격 : ");
            int price = sc.nextInt();
            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            productOrders[i] = createProductOrder(productName, price, quantity);
        }
        //상품 주문정보와 최종 금액 출력

        printOrders(productOrders);
        System.out.println();
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
