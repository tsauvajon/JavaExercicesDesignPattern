/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observer.chasse;

/**
 *
 * @author tkint
 */
public class CanardObservable extends Observable implements IEmissionSonore {

    private IEmissionSonore emissionSonore;
    private IVol maFaconDeVoler;

    public CanardObservable(IEmissionSonore emissionSonore) {
        this.emissionSonore = emissionSonore;
        this.maFaconDeVoler = new Vol();
    }

    @Override
    public void emetUnSon() {
        emissionSonore.emetUnSon();
        notifierObservateurs();
    }

    @Override
    public void recupereNotification() {
        maFaconDeVoler = new NoVol();
    }
    
    public void vole() {
        maFaconDeVoler.vole();
    }
}
