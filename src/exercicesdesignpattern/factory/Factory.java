/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.factory;

import exercicesdesignpattern.factory.robot.FabriqueARobot;
import exercicesdesignpattern.factory.robot.IRobot;

/**
 *
 * @author Thomas Kint
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        robot();
    }
    
    private static void robot() {
        FabriqueARobot fabrique = new FabriqueARobot();
        IRobot robotTueur = fabrique.fabriqueUnRobot("tueur");
        IRobot robotAmical = fabrique.fabriqueUnRobot("amical");

        robotTueur.afficheToi();
        robotAmical.afficheToi();
    }
}
