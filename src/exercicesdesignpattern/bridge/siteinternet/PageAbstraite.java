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
public abstract class PageAbstraite {

    protected Contenu contenu;

    public PageAbstraite(Contenu contenu) {
        this.contenu = contenu;
    }

    public abstract void afficheContenu();
}
