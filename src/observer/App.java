package observer;

public class App {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        account.addObserver(new EmailNotification());
        account.addObserver(new PushNotification());

        account.deposit(50.0);
        account.withdraw(20.0);
    }
}
