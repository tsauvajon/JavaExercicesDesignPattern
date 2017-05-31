/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.decorator.emetson;

/**
 *
 * @author thomas.sauvajon
 */
public class AdaptateurOie implements IEmetSon {
    private Oie oie;
    
    public AdaptateurOie(Oie oie) {
        this.oie = oie;
    }
    
    @Override
    public void emetUnSon() {
        System.out.println("Pouet pouet");
    }
    
}
