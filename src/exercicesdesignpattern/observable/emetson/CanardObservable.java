/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observable.emetson;

/**
 *
 * @author thomas.sauvajon
 */
public class CanardObservable extends Observable implements IEmetSon {

    @Override
    public void emetUnSon() {
        notifier();
    }
    
}
