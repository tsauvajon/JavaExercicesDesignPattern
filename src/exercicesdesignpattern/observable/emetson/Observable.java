/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observable.emetson;

import java.util.ArrayList;

/**
 *
 * @author thomas.sauvajon
 */
public class Observable {
    ArrayList<Observateur> observateurs;
    
    public Observable() {
        this.observateurs = new ArrayList();
    }
    
    public void notifier() {
        observateurs.forEach(o -> o.reagit(this));
    };
    
    public void addObservateur(Observateur o) {
        this.observateurs.add(o);
    }
}
