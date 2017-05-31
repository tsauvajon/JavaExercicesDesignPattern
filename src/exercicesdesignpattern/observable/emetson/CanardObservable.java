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
public class CanardObservable extends Observable implements IEmetSon {
    private Canard canard;
    public CanardObservable(Canard c) {
        this.canard = c;
    }
    
    @Override
    public void emetUnSon() {
        notifier();
    }    

    /**
     * @return the canard
     */
    public Canard getCanard() {
        return canard;
    }

    /**
     * @param canard the canard to set
     */
    public void setCanard(Canard canard) {
        this.canard = canard;
    }
}
