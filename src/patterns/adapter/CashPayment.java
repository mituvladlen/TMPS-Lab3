package patterns.adapter;
import domain.payments.PaymentMethod;
public class CashPayment implements PaymentMethod {
    public boolean pay(double amount) {
        System.out.println("[Cash] Received $" + amount);
        return true;
    }
    public String getType() { return "Cash"; }
}