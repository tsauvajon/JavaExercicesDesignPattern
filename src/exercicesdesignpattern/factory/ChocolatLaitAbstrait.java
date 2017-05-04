/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.factory;

/**
 *
 * @author tkint
 */
public abstract class ChocolatLaitAbstrait implements IChocolat {

    @Override
    public void afficheToi() {
        System.out.println("Chocolat au lait");
    }
}
