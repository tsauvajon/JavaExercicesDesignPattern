/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern;

import exercicesdesignpattern.strategy.logger.Logger_Console;
import exercicesdesignpattern.strategy.logger.Formater_HTML;
import exercicesdesignpattern.strategy.logger.Logger;
import exercicesdesignpattern.strategy.logger.Formater_XML;

/**
 *
 * @author tkint
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger log = new Logger_Console(new Formater_XML());
        log.write("Mon log en XML");
        log.setFormater(new Formater_HTML());
        log.write("Mon log en HTML");
    }
}
