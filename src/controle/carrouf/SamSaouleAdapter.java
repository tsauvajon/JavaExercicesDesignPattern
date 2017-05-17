package controle.carrouf;

/**
 * Created by thomas.sauvajon on 05/05/2017.
 */
public class SamSaouleAdapter implements IChargeable {
    private PortableSamSaoule portable;

    SamSaouleAdapter(PortableSamSaoule samsaoule) {
        this.portable = samsaoule;
    }

    @Override
    public void Recharger(int volts) {
        portable.ChargerPortable(volts);
    }
}
