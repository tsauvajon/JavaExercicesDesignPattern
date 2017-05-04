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
public class Page extends PageAbstraite {

    private String titre;

    public Page(String titre, Contenu contenu) {
        super(contenu);
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public void afficheContenu() {
        System.out.println(titre);
        contenu.affiche();
        System.out.println("-------------------");
    }
}
