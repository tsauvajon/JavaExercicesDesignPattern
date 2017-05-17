package controle.pizzaCarte;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public abstract class DecoratorIngredient extends Pizza {
    private Pizza objetDecore;

    public DecoratorIngredient(Pizza objetDecore) {
        this.objetDecore = objetDecore;
    }

    @Override
    public void prepareToi() {
        if (objetDecore != null) {
            objetDecore.prepareToi();
        }
    }

}
