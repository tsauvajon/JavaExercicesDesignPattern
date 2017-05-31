/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observable.emetson;

import exercicesdesignpattern.strategy.canard.Canard;

/**
 *
 * @author thomas.sauvajon
 */
public class AdaptateurOie extends Canard {
    private Oie oie;
    
    public AdaptateurOie(Oie oie) {
        this.oie = oie;
    }

    @Override
    public void afficheToi() {
        System.out.println("Je suis une oie");
    }
    
    @Override
    public void faisCoinCoin() {
        System.out.println("Coin coin de l'oie");
    }
}
