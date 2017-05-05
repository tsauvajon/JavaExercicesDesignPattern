/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.facade.imprimante;

/**
 *
 * @author Thomas
 */
public class FeuilleA5 implements IFeuille {

    @Override
    public void imprimeToi() {
        System.out.println("Feuille A5");
    }
}
