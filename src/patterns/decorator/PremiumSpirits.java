package patterns.decorator;
import domain.beverages.Cocktail;
public class PremiumSpirits extends CocktailDecorator {
    public PremiumSpirits(Cocktail c) { super(c); }
    public String getDescription() { return cocktail.getDescription() + " (Premium)"; }
    public double getPrice() { return cocktail.getPrice() + 5.00; }
    public String getIngredients() { return "Premium " + cocktail.getIngredients(); }
}