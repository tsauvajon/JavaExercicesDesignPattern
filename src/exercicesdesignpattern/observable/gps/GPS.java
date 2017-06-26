/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.observable.gps;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thomas.sauvajon
 */
public class GPS extends Observable implements Runnable {
    private String position;
    private int precision;

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the precision
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * @param precision the precision to set
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public void run() {
        Random rd = new Random();
        for(;;) {
            try {
                setPosition("[" + rd.nextInt(1000) + ", " + rd.nextInt(1000) + "]");
                setPrecision(3);
                notifie();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GPS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
