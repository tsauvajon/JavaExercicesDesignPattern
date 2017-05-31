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
        CanardObservable observable = new CanardObservable(new Morillon());
                
        observable.addObservateur(new Chasseur());
        observable.addObservateur(new Chasseur());
        observable.addObservateur(new Chasseur());
        observable.addObservateur(new Chasseur());

        observable.emetUnSon();
        
        CanardObservable observable2 = new CanardObservable(new AdaptateurOie(new Oie()));
        
        observable2.addObservateur(new Chasseur());
        observable2.addObservateur(new Chasseur());
        
        observable2.emetUnSon();
    }
    
}
