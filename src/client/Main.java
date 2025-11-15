package client;
import domain.beverages.*;
import domain.models.Customer;
import domain.payments.PaymentMethod;
import patterns.adapter.*;
import patterns.decorator.*;
import patterns.facade.CocktailShopFacade;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  COCKTAIL SHOP MANAGEMENT SYSTEM");
        System.out.println("========================================\n");

        System.out.println("--- DECORATOR PATTERN ---");
        Cocktail mojito = new Mojito();
        System.out.println(mojito.getDescription() + " - $" + mojito.getPrice());
        
        mojito = new MintLeaves(mojito);
        mojito = new LimeGarnish(mojito);
        System.out.println(mojito.getDescription() + " - $" + mojito.getPrice());
        
        Cocktail margarita = new PremiumSpirits(new Margarita());
        System.out.println(margarita.getDescription() + " - $" + margarita.getPrice() + "\n");

        System.out.println("--- ADAPTER PATTERN ---");
        PaymentMethod paypal = new PayPalAdapter();
        PaymentMethod cash = new CashPayment();
        System.out.println("Available: " + paypal.getType() + ", " + cash.getType() + "\n");

        System.out.println("--- FACADE PATTERN ---");
        CocktailShopFacade shop = new CocktailShopFacade();
        
        Customer john = new Customer("John Doe", "john@email.com");
        shop.placeOrder(john, mojito, paypal);

        Customer jane = new Customer("Jane Smith", "jane@email.com");
        shop.placeOrder(jane, margarita, paypal);
        
        Customer bob = new Customer("Bob Johnson", "bob@email.com");
        Cocktail oldFashioned = new OldFashioned();
        shop.placeOrder(bob, oldFashioned, cash);

        System.out.println("========================================");
        System.out.println("  All patterns demonstrated!");
        System.out.println("========================================");
    }
}