/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern;

import exercicesdesignpattern.adapter.CanardDindon;
import exercicesdesignpattern.adapter.Dindon;
import exercicesdesignpattern.adapter.Dodo;
import exercicesdesignpattern.strategy.canard.*;
import exercicesdesignpattern.strategy.personnage.*;
import exercicesdesignpattern.strategy.logger.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tkint
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //canardTest();
        //personnageTest();
        //logTest();
        dodoTest();
    }

    private static void canardTest() {
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

    private static void personnageTest() {
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

    private static void logTest() {
        Logger log = new Logger_Console(new Formater_HTML());
        log.write("Mon log en HTML");
        log.setFormater(new Formater_XML());
        log.write("Mon log en XML");
    }

    private static void dodoTest() {
        List<Canard> canards = new ArrayList<>();
        canards.add(new Morillon());
        canards.add(new Colvert());
        canards.add(new CanardEnBois());
        canards.add(new CanardDindon(new Dodo()));

        for (Canard canard : canards) {
            canard.afficheToi();
            canard.faisCoinCoin();
        }
    }
}
