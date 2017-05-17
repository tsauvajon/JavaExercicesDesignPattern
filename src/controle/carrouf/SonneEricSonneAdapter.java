package controle.carrouf;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class SonneEricSonneAdapter implements IChargeable {
    private PortableSonneEricSonne portable;

    SonneEricSonneAdapter(PortableSonneEricSonne sonneEricSonne) {
        this.portable = sonneEricSonne;
    }

    @Override
    public void Recharger(int volts) {
        portable.ChargerBatteries(volts);
    }
}
