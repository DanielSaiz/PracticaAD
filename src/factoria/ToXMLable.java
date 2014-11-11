/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoria;

import java.util.LinkedHashMap;

/**
 *
 * @author alvaro
 */
public interface ToXMLable {
    
    public void toXML(String file, LinkedHashMap obj);
    
    public Object fromXML(String file);
    
}
