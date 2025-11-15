package patterns.decorator;
import domain.beverages.Cocktail;
public class MintLeaves extends CocktailDecorator {
    public MintLeaves(Cocktail c) { super(c); }
    public String getDescription() { return cocktail.getDescription() + " + Mint"; }
    public double getPrice() { return cocktail.getPrice() + 0.75; }
    public String getIngredients() { return cocktail.getIngredients() + ", Mint"; }
}