/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observable.emetson;

/**
 *
 * @author thomas.sauvajon
 */
public class Chasseur extends Observateur {
    public void reagit(Observable obs) {
        System.out.println("Je tue le canard: " + obs.toString());
    }
}
