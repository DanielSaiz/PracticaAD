/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factoria;

import accesoadatos2.datos.Persona;
import datos.Compra;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import sun.rmi.runtime.Log;

/**
 *
 * @author alvaro
 */
public class JaxbMio implements ToXMLable{

    @Override
    public Object fromXML(String nombre) {
                File file=new File(nombre);
        if(nombre.compareTo("personas.xml")==0){
            try {
                JAXBContext jc = JAXBContext.newInstance(Persona.class);
                Unmarshaller jaxbUnmarshaller = jc.createUnmarshaller();
                LinkedHashMap<Integer,Persona> personas = (LinkedHashMap<Integer,Persona>) jaxbUnmarshaller.unmarshal(file);
                return personas;
                
            } catch (JAXBException ex) {
                Logger.getLogger(JaxbMio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try{
                JAXBContext jc = JAXBContext.newInstance(Compra.class);
                Unmarshaller jaxbUnmarshaller = jc.createUnmarshaller();
                LinkedHashMap<Integer,Compra> compras = (LinkedHashMap<Integer,Compra>) jaxbUnmarshaller.unmarshal(file);  
                return compras;
            }catch(JAXBException ex) {
                Logger.getLogger(JaxbMio.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        return null;
    }
    
    @Override
    public void toXML(String file, LinkedHashMap obj) {
        
    }
    
}
