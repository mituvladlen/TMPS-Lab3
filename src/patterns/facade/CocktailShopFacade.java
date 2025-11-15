package patterns.facade;
import domain.beverages.Cocktail;
import domain.models.*;
import domain.payments.PaymentMethod;
public class CocktailShopFacade {
    public Order placeOrder(Customer customer, Cocktail cocktail, PaymentMethod payment) {
        System.out.println("\n=== Processing Order for " + customer.getName() + " ===");
        Order order = new Order(customer, cocktail);
        System.out.println("Order #" + order.getId());
        System.out.println("Item: " + cocktail.getDescription());
        System.out.println("Price: $" + cocktail.getPrice());
        if (payment.pay(order.getTotal())) {
            order.setStatus("COMPLETED");
            System.out.println("Payment: " + payment.getType() + " - SUCCESS");
            System.out.println("Status: COMPLETED\n");
        } else {
            System.out.println("Payment FAILED\n");
        }
        return order;
    }
}