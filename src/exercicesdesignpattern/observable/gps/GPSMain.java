/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observable.gps;

/**
 *
 * @author thomas.sauvajon
 */
public class GPSMain {
    public static void main(String[] args) {
        GPS gps = new GPS();
        // gps.setPosition("Avenue des Apothicaires, Montpellier");
        // gps.setPrecision(1);
        gps.addObservateur(new AfficheurComplet());
        
        GPS gps2 = new GPS();
        gps2.addObservateur(new AfficheurSimple());
        
        new Thread(gps).start();
        new Thread(gps2).start();
    }
}
