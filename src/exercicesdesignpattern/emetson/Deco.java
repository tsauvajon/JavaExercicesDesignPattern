/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.emetson;

/**
 *
 * @author thomas.sauvajon
 */
public class Deco implements IEmetSon {
    private final IEmetSon es;
    
    static int cpt;
    
    Deco (IEmetSon e) {
        es = e;
    }
    
    @Override
    public void emetUnSon() {
        cpt++;
        es.emetUnSon();
    }
}
