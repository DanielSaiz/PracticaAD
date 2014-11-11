/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import accesoadatos2.datos.Persona;
import com.thoughtworks.xstream.XStream;
import datos.Compra;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;

/**
 *
 * @author dam2
 */

public class FicherosDatos {
    
    public void toXMLPersona(String nombreFichero, LinkedHashMap<Integer, Persona> datos) {
        XStream xstream = new XStream();
//        xstream.alias("Persona", Persona.class);
//        xstream.useAttributeFor(Persona.class, "id");
        try {
            xstream.toXML(datos,new FileOutputStream(nombreFichero));
        } catch (FileNotFoundException ex) {}
        System.out.println("Creado fichero XML con las personas...");
    }
    public void toXMLCompra(String nombreFichero, LinkedHashMap<Integer, Compra> datos){
        XStream xstream = new XStream();
        
        try {
            xstream.toXML(datos, new FileOutputStream(nombreFichero));
        } catch (FileNotFoundException ex) {}
        System.out.println("Creado fichero XML con las compras...");
    }
    public LinkedHashMap<Integer,Persona> fromXMLPersona(String nombreFichero){
        XStream xstream = new XStream();
        LinkedHashMap<Integer, Persona> personas = new LinkedHashMap<>();
        try {
            personas = (LinkedHashMap<Integer, Persona>) xstream.fromXML(new FileInputStream(nombreFichero));
        } catch (FileNotFoundException ex) {}
        
        return personas;
    }
    public LinkedHashMap<Integer,Compra> fromXMLCompra(String nombreFichero){
        XStream xstream = new XStream();
        LinkedHashMap<Integer, Compra> compras = new LinkedHashMap<>();
        try {
            compras = (LinkedHashMap<Integer, Compra>) xstream.fromXML(new FileInputStream(nombreFichero));
        } catch (FileNotFoundException ex) {}
        
        return compras;
    }
    
    
    
}
