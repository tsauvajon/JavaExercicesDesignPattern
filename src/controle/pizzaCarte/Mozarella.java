package controle.pizzaCarte;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class Mozarella extends DecoratorIngredient {
    public Mozarella(Pizza objetDecore) {
        super(objetDecore);
    }

    @Override
    public void prepareToi() {
        super.prepareToi();
        ajouteMozza();
    }

    private void ajouteMozza() {
        System.out.println("J'ai de la mozzarella");
    }
}
