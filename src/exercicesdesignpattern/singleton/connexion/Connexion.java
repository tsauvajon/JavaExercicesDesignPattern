/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.singleton.connexion;

/**
 *
 * @author tkint
 */
public class Connexion {

    private static Connexion instance;

    private Connexion() {
        System.out.println("Nouvelle connexion");
    }

    public static Connexion getInstance() {
        if (instance == null) {
            instance = new Connexion();
        } else {
            System.out.println("Récupération de la connexion");
        }
        return instance;
    }
}
