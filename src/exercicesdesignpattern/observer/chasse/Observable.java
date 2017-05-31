/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observer.chasse;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tkint
 */
public abstract class Observable {

    protected List<IObservateur> observateurs;

    public Observable() {
        observateurs = new ArrayList<>();
    }

    public void notifierObservateurs() {
        for (IObservateur observateur : observateurs) {
            observateur.reagit(this);
        }
    }
    
    public abstract void recupereNotification();
}
