package domain.models;
import domain.beverages.Cocktail;
public class Order {
    private static int counter = 1;
    private int id;
    private Customer customer;
    private Cocktail cocktail;
    private String status;
    public Order(Customer customer, Cocktail cocktail) {
        this.id = counter++;
        this.customer = customer;
        this.cocktail = cocktail;
        this.status = "PENDING";
    }
    public int getId() { return id; }
    public Customer getCustomer() { return customer; }
    public Cocktail getCocktail() { return cocktail; }
    public double getTotal() { return cocktail.getPrice(); }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}