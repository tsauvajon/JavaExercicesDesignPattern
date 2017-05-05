/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.adapter;

import exercicesdesignpattern.adapter.dindon.*;
import exercicesdesignpattern.strategy.canard.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas Kint
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dodoTest();
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
