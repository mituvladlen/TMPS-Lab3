package domain.payments;
public interface PaymentMethod {
    boolean pay(double amount);
    String getType();
}