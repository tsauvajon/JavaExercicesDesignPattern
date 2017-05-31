/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observable.emetson;

import exercicesdesignpattern.strategy.canard.Canard;
import exercicesdesignpattern.strategy.canard.NoVol;

/**
 *
 * @author thomas.sauvajon
 */
public class Chasseur extends Observateur {
    public void reagit(Observable obs) {
        System.out.println("Bim le canard");
        CanardObservable c = (CanardObservable) obs;
        c.getCanard().setMaFaconDeVoler(new NoVol());
    }
}
