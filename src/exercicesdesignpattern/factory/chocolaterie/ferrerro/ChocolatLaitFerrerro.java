/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.factory.chocolaterie.ferrerro;

import exercicesdesignpattern.factory.chocolaterie.ChocolatLaitAbstrait;

/**
 *
 * @author tkint
 */
public class ChocolatLaitFerrerro extends ChocolatLaitAbstrait {

    @Override
    public void afficheToi() {
        System.out.println("Chocolat au lait ferrerro");
    }
}
