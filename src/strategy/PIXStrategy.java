package strategy;

public class PIXStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PIX");   
    }
}
