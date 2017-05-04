/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.decorator.upperreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author tkint
 */
public abstract class DecorateurDeReader extends BufferedReader {

    public DecorateurDeReader(Reader reader) {
        super(reader);
    }
}
