package oop1.ex;

public class AccountMain {
    public static void main(String[] args){
        Account a = new Account();
        a.deposit(10000);
        a.withdraw(9000);
        a.withdraw(2000);
        a.showStatus();
    }
}
