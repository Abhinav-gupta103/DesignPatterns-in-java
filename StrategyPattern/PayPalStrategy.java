package StrategyPattern;

// Step 2:- Implement Concrete Strategies
public class PayPalStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }

}
