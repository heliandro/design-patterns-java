package strategy;

public class App {
    public static void main(String[] args) throws Exception {
        
        Context context = new Context(new PIXStrategy());
        context.pay(100.0);
        
        context.setStrategy(new TEDStrategy());
        context.pay(200.0);
    }
}
