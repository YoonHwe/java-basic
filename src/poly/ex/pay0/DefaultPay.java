package poly.ex.pay0;

public class DefaultPay implements InterfacePay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제수단이 없습니다.");
        return false;
    }
}
