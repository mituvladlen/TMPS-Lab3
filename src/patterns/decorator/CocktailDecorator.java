package patterns.decorator;
import domain.beverages.Cocktail;
public abstract class CocktailDecorator implements Cocktail {
    protected Cocktail cocktail;
    public CocktailDecorator(Cocktail cocktail) { this.cocktail = cocktail; }
}