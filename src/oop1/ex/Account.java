package oop1.ex;

public class Account {
    int balance = 0;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if(balance < amount) {
            System.out.println("잔액 부족");
            return;
        }
        balance -= amount;
    }

    void showStatus(){
        System.out.println("현재 잔액 : " + balance);
    }
}
