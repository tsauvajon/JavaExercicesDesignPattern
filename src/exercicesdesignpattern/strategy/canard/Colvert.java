/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.strategy.canard;

/**
 *
 * @author tkint
 */
public class Colvert extends Canard {

    public Colvert() {
        setMaFaconDeVoler(new VolAvecAiles());
    }

    @Override
    public void afficheToi() {
        System.out.println("Je suis un Colvert");
    }
}
