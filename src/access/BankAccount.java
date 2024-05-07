package access;

public class BankAccount {
    private int balance;

    //Command + n : Generator 띄워서 생성자, Getter/Setter 쉽게 만들 수 있음.
    public BankAccount() {
        balance = 0;
    }

    //public 메서드 : deposit
    public void deposit(int amount){
        if(isAmountVaild(amount)) balance += amount;
        else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //public 메서드 : withdraw
    public void withdraw(int amount){
        if(isAmountVaild(amount) && balance >= amount){
            balance -= amount;
        } else {
            System.out.println("유효하지 않거나 잔액이 부족합니다.");
        }
    }

    //public 메서드 : getBalance
    public int getBalance(){
        return balance;
    }
    private boolean isAmountVaild(int amount){
        return amount > 0;
    }
}
