package controle.carrouf;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class Carrouf {

    public static void main(String[] args) {
        IChargeable samsaoule = new SamSaouleAdapter(new PortableSamSaoule());
        samsaoule.Recharger(10);

        System.out.println();

        IChargeable sonneEricSonne = new SonneEricSonneAdapter(new PortableSonneEricSonne());
        sonneEricSonne.Recharger(5);
    }
}
