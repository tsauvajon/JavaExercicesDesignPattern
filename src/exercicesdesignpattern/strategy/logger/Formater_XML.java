/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.strategy.logger;

/**
 *
 * @author tkint
 */
public class Formater_XML implements IFormater {

    @Override
    public String format(String message) {
        return "<XML><Message>" + message + "</Message></XML>";
    }
}
