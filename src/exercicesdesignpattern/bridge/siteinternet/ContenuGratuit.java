/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.bridge.siteinternet;

/**
 *
 * @author Thomas
 */
public class ContenuGratuit implements Contenu {

    @Override
    public void affiche() {
        System.out.println("Contenu gratuit");
    }
}
