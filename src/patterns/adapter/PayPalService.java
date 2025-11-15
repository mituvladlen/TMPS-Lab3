package patterns.adapter;
public class PayPalService {
    public boolean makePayment(double amount) {
        System.out.println("[PayPal] Payment $" + amount);
        return true;
    }
}