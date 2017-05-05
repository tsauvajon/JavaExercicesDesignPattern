/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.strategy.ordinateur;

/**
 *
 * @author Thomas Kint
 */
public class OrdinateurPC extends Ordinateur {

    public OrdinateurPC() {
        setProcesseur(new ProcesseurPC());
    }

    @Override
    public void afficheToi() {
        System.out.println("Ordinateur PC");
        getProcesseur().afficheToi();
        System.out.println("--------------------------");
    }
}
