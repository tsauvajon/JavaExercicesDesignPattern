/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observable.gps;

import java.util.ArrayList;

/**
 *
 * @author thomas.sauvajon
 */
public abstract class Observable {
    private ArrayList<Observateur> observateurs = new ArrayList();
    
    public void notifie() {
        getObservateurs().forEach(o -> o.reagit(this));
    }

    /**
     * @return the observateurs
     */
    public ArrayList<Observateur> getObservateurs() {
        return observateurs;
    }

    /**
     * @param observateurs the observateurs to set
     */
    public void setObservateurs(ArrayList<Observateur> observateurs) {
        this.observateurs = observateurs;
    }
    
    public void addObservateur(Observateur o) {
        getObservateurs().add(o);
    }
}
