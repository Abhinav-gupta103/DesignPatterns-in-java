package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1234", 100));
        cart.addItem(new Item("5678", 300));

        cart.pay(new CreditCardStrategy("1234567889", "Abhinav Gupta", "123", "12/23"));
        cart.pay(new PayPalStrategy("abhinav.gupta234@hello.com", "password890"));

        cart.pay(new BitcoinStrategy("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
    }
}
