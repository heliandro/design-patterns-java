package observer;

public class EmailNotification implements Observer {

    @Override
    public void update(double amount) {
        System.out.println("Sending email notification for payment of " + amount);
    }
}
