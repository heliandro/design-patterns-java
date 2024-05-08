package strategy;

public class TEDStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using TED");
    }
}
