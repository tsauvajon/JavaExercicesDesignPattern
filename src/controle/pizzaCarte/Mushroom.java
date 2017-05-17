package controle.pizzaCarte;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class Mushroom extends DecoratorIngredient {
    public Mushroom(Pizza objetDecore) {
        super(objetDecore);
    }

    @Override
    public void prepareToi() {
        super.prepareToi();
        ajouteChampis();
    }

    private void ajouteChampis() {
        System.out.println("J'ai des champignons");
    }
}
