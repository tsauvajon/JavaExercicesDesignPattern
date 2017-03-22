/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.adapter;

import exercicesdesignpattern.strategy.canard.Canard;

/**
 *
 * @author tkint
 */
public class CanardDindon extends Canard {

    private Dindon dindon;

    public CanardDindon(Dindon dindon) {
        this.dindon = dindon;
    }

    @Override
    public void afficheToi() {
        dindon.presenteToi();
    }

    @Override
    public void faisCoinCoin() {
        dindon.faitGlouGlou();
    }

    public Dindon getDindon() {
        return dindon;
    }

    public void setDindon(Dindon dindon) {
        this.dindon = dindon;
    }
}
