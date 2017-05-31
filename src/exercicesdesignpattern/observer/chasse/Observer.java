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
public class Observer {

    public static void main(String[] args) {
        CanardObservable colvert = new CanardObservable(new Colvert());
        CanardObservable morillon = new CanardObservable(new Morillon());
        
        IObservateur chasseur1 = new Chasseur();
        IObservateur chasseur2 = new Chasseur();
        
        colvert.observateurs.add(chasseur1);
        colvert.observateurs.add(chasseur2);
        morillon.observateurs.add(chasseur1);
        
        System.out.println("-- COLVERT --");
        
        colvert.vole();
        colvert.emetUnSon();
        colvert.vole();
        
        System.out.println("-----------------------");
        System.out.println("-- MORILLON --");
        
        morillon.vole();
        morillon.emetUnSon();
        morillon.vole();
    }
}
