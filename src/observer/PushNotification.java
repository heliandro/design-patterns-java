package observer;

public class PushNotification implements Observer {

    @Override
    public void update(double amount) {
        System.out.println("Sending push notification for payment of " + amount);
    }
}
