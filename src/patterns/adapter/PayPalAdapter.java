package patterns.adapter;
import domain.payments.PaymentMethod;
public class PayPalAdapter implements PaymentMethod {
    private PayPalService service = new PayPalService();
    public boolean pay(double amount) { return service.makePayment(amount); }
    public String getType() { return "PayPal"; }
}