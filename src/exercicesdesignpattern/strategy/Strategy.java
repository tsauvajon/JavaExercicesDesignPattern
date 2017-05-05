/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.strategy;

import exercicesdesignpattern.strategy.canard.*;
import exercicesdesignpattern.strategy.logger.*;
import exercicesdesignpattern.strategy.ordinateur.*;
import exercicesdesignpattern.strategy.personnage.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas Kint
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        canard();
        logger();
        ordinateur();
        personnage();
    }

    private static void canard() {
        List<Canard> canards = new ArrayList<>();
        canards.add(new Morillon());
        canards.add(new Colvert());
        canards.add(new CanardEnBois());

        for (Canard canard : canards) {
            canard.afficheToi();
            canard.envoleToi();
            canard.nage();
        }

        canards.get(2).setMaFaconDeVoler(new VolAvecAiles());
        canards.get(2).afficheToi();
        canards.get(2).envoleToi();
    }

    private static void logger() {
        Logger log = new Logger_Console(new Formater_HTML());
        log.write("Mon log en HTML");
        log.setFormater(new Formater_XML());
        log.write("Mon log en XML");
    }

    private static void ordinateur() {
        Ordinateur ordinateurPC = new OrdinateurPC();
        ordinateurPC.afficheToi();

        Ordinateur ordinateurMac = new OrdinateurMac();
        ordinateurMac.afficheToi();
    }

    private static void personnage() {
        List<Personnage> personnages = new ArrayList<>();
        personnages.add(new Chevalier());
        personnages.add(new Brigand());
        personnages.add(new Troll());

        for (Personnage personnage : personnages) {
            personnage.batsToi();
        }

        personnages.get(1).setMonStyleDeCombat(new CombatALaHache());
        personnages.get(1).batsToi();
    }
}
