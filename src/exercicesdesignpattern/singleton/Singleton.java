/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.singleton;

import exercicesdesignpattern.singleton.connexion.Connexion;

/**
 *
 * @author Thomas Kint
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connexion();
    }
    
    private static void connexion() {
        Connexion.getInstance();
        Connexion.getInstance();
    }
}
