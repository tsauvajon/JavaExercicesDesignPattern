/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observable.gps;

/**
 *
 * @author thomas.sauvajon
 */
public abstract class Afficheur implements Observateur {
    @Override
    public void reagit(Observable instance) {
        String pos = ((GPS)instance).getPosition();
        System.out.println("Position : " + pos);
    }    
}
