/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.factory.robot;

/**
 *
 * @author Thomas Kint
 */
public class RobotAmical implements IRobot {

    @Override
    public void afficheToi() {
        System.out.println("Salut, comment ça va?");
    }
}
