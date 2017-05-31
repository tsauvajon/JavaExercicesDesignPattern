/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observer.chasse;

/**
 *
 * @author tkint
 */
public class Chasseur implements IObservateur {

    @Override
    public void reagit(Observable observable) {
        System.out.println("OH MON DIEU!! PAN PAN PAN");
        observable.recupereNotification();
    }
}
