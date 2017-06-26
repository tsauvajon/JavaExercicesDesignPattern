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
public class AfficheurComplet extends Afficheur {
    @Override
    public void reagit(Observable instance) {
        int prec = ((GPS)instance).getPrecision();
        System.out.println("Précision : " + prec);
        super.reagit(instance);
    }    
}
