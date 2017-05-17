package controle.pizzaCarte;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class Ham extends DecoratorIngredient {
    public Ham(Pizza objetDecore) {
        super(objetDecore);
    }

    @Override
    public void prepareToi() {
        super.prepareToi();
        ajouteHam();
    }

    private void ajouteHam() {
        System.out.println("J'ai du jambon");
    }
}
