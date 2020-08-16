package com.hluther.controlClasses;

import com.hluther.parser.ParseException;
import com.hluther.parser.Parser;
import com.hluther.gui.PrincipalFrame;
import java.io.StringReader;
/**
 *
 * @author helmuth
 */
public class AnalysisDriver {
    
    public void doAnalysis(String text, PrincipalFrame principalFrame){
        try {
            Parser parser = new Parser(new StringReader(text));
            parser.setPrincipalFrame(principalFrame);
            parser.start();
        } catch (ParseException ex) {
            System.out.println("Error al analizar.");
        }
    }
   
}
