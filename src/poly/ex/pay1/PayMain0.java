package poly.ex.pay1;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {

        PayService payService = new PayService();

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("결제수단을 입력하세요 : ");
            String option = sc.nextLine();
            if(option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("결제금액을 입력하세요 : ");
            int amount = Integer.parseInt(sc.nextLine());

            payService.processPay(option, amount);
        }
    }
}
