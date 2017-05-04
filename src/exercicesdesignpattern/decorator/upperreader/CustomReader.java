/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.decorator.upperreader;

import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author tkint
 */
public class CustomReader extends DecorateurDeReader {

    public CustomReader(Reader reader) {
        super(reader);
    }

    @Override
    public String readLine() throws IOException {
        return super.readLine().toUpperCase();
    }

}
