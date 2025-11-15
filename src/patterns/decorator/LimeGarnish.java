package patterns.decorator;
import domain.beverages.Cocktail;
public class LimeGarnish extends CocktailDecorator {
    public LimeGarnish(Cocktail c) { super(c); }
    public String getDescription() { return cocktail.getDescription() + " + Lime"; }
    public double getPrice() { return cocktail.getPrice() + 0.50; }
    public String getIngredients() { return cocktail.getIngredients() + ", Lime"; }
}