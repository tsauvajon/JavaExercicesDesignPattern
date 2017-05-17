package controle.pizzaCarte;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class PizzaCarte {
    public static void main(String[] args) {

        Pizza pizza = new Mushroom(new Ham(new Parmesan(new Mozarella(new PateSolo()))));
        pizza.prepareToi();

        Pizza reine = new Mushroom(new Ham(new PateGenerousCrust()));
        reine.prepareToi();
    }
}
