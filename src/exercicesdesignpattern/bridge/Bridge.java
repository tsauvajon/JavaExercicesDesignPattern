/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.bridge;

import exercicesdesignpattern.bridge.siteinternet.*;

/**
 *
 * @author Thomas Kint
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        siteInternet();
    }

    private static void siteInternet() {
        SiteInternet siteInternet = new SiteInternet();

        PageAbstraite accueil = new Page("Accueil", new ContenuGratuit());
        PageAbstraite espaceGratuit = new Page("Espace gratuit", new ContenuGratuit());
        PageAbstraite espacePremium = new Page("Espace premium", new ContenuPayant());

        siteInternet.addPage(accueil);
        siteInternet.addPage(espaceGratuit);
        siteInternet.addPage(espacePremium);

        siteInternet.afficheContenu();
    }
}
