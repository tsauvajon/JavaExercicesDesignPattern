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
public class Logger_Console extends Logger {

    public Logger_Console(IFormater formater) {
        this.formater = formater;
    }

    @Override
    public void write(String message) {
        System.out.println(formater.format(message));
    }
}
