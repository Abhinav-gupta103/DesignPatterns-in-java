package services;

public class PaymentService {

    public Boolean processPayment(int amt) {
        System.out.println("Processing payment of Rs." + amt);
        return true;
    }

}
