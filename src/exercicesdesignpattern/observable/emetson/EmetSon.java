/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observable.emetson;

import exercicesdesignpattern.strategy.canard.Colvert;
import exercicesdesignpattern.strategy.canard.Morillon;

/**
 *
 * @author thomas.sauvajon
 */
public class EmetSon {
    public static void main(String[] args) {
        CanardObservable canard = new CanardObservable(new Morillon());
                
        canard.addObservateur(new Chasseur());
        canard.addObservateur(new Chasseur());
        canard.addObservateur(new Chasseur());
        canard.addObservateur(new Chasseur());

        canard.emetUnSon();
        
        CanardObservable autreCanard = new CanardObservable(new AdaptateurOie(new Oie()));
        
        autreCanard.addObservateur(new Chasseur());
        autreCanard.addObservateur(new Chasseur());
        
        autreCanard.emetUnSon();
    }
    
}
