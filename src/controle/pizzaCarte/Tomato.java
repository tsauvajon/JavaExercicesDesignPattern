package controle.pizzaCarte;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class Tomato extends DecoratorIngredient {
    public Tomato(Pizza objetDecore) {
        super(objetDecore);
    }

    @Override
    public void prepareToi() {
        super.prepareToi();
        ajouteTomates();
    }

    private void ajouteTomates() {
        System.out.println("J'ai des tomates");
    }
}
