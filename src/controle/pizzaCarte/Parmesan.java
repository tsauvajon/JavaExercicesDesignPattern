package controle.pizzaCarte;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class Parmesan extends DecoratorIngredient {
    public Parmesan(Pizza objetDecore) {
        super(objetDecore);
    }

    @Override
    public void prepareToi() {
        super.prepareToi();
        ajouteParmesan();
    }

    private void ajouteParmesan() {
        System.out.println("J'ai du parmesan");
    }
}
