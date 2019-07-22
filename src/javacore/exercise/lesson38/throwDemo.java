package javacore.exercise.lesson38;

public class throwDemo {
    public static void main(String[] args) {

        AccountManager accountManager = new AccountManager();
        System.out.println("Hesap : " +accountManager.getBalance());

        accountManager.deposit(100);
        System.out.println("Hesap  : " +accountManager.getBalance());

        try {
            accountManager.withdraw(90);
        } catch (BalanceInsufficentException e) {
            System.out.println(e);
        }
        System.out.println("Hesap  : " +accountManager.getBalance());

        try {
            accountManager.withdraw(20);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hesap  : " +accountManager.getBalance());


    }
}
