package Monday;

public class Bank_Main {

    public static void main(String[] args) {

        HSBC worcester = new HSBC();
        worcester.Deposit(50);
        worcester.Withdraw(20);
        System.out.println("Worcester balance: " + worcester.balance);

        HSBC manchester = new HSBC();
        manchester.Deposit(100);
        manchester.Withdraw(20);
        System.out.println("Manchester balance: " + manchester.balance);

        System.out.println(HSBC.total);
    }
}
