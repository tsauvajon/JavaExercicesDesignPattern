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
public abstract class Ordinateur {

    private Processeur processeur;

    public Processeur getProcesseur() {
        return processeur;
    }

    public void setProcesseur(Processeur processeur) {
        this.processeur = processeur;
    }
    
    public abstract void afficheToi();
}
