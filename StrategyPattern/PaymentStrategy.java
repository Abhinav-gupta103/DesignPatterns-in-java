package StrategyPattern;

// Step 1:- This is a interface defines the common behaviour(the strategy) for all payment methods
public interface PaymentStrategy {
    void pay(int amount);
}
