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
public class FabriqueARobot {

    public IRobot fabriqueUnRobot(String type) {
        IRobot robot = null;
        switch (type) {
            case "tueur":
                robot = new RobotTueur();
                break;
            case "amical":
                robot = new RobotAmical();
                break;
        }
        return robot;
    }
}
