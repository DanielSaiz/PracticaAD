/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoria;

import accesoadatos2.datos.Persona;
import com.thoughtworks.xstream.XStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;

/**
 *
 * @author alvaro
 */
public class XstreamMio implements ToXMLable{

    @Override
    public Object fromXML(String file) {        
        XStream xstream = new XStream();
        LinkedHashMap<Integer, Persona> personas = new LinkedHashMap<>();
        try {
            personas = (LinkedHashMap<Integer, Persona>) xstream.fromXML(new FileInputStream(file));
        } catch (FileNotFoundException ex) {}
        
        return personas;
    }

    @Override
    public void toXML(String file, LinkedHashMap obj) {    
        XStream xstream = new XStream();        
        try {
            xstream.toXML(obj, new FileOutputStream(file));
        } catch (FileNotFoundException ex) {}
        System.out.println("Creado fichero xml...");
        
    }
    
}
