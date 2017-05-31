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
public class Colvert implements IEmissionSonore {

    @Override
    public void emetUnSon() {
        System.out.println("Je suis un colvert.");
    }
}
