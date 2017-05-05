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
public class ProcesseurMac implements IProcesseur {

    @Override
    public void afficheToi() {
        System.out.println("Processeur de Mac");
    }
}
