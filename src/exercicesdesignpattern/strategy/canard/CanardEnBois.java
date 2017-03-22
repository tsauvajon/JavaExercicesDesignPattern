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
public class CanardEnBois extends Canard {

    public CanardEnBois() {
        setMaFaconDeVoler(new NoVol());
    }
    
    @Override
    public void afficheToi() {
        System.out.println("Je suis un canard en bois");
    }
}
