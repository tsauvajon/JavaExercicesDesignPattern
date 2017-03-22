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
public abstract class Logger {

    protected IFormater formater;

    public void write(String message) {
        formater.format(message);
    }

    public IFormater getFormatter() {
        return formater;
    }

    public void setFormater(IFormater formater) {
        this.formater = formater;
    }
}
