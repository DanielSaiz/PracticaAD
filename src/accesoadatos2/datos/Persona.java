/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos2.datos;

import datos.Compra;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dam2
 */
public class Persona implements Serializable {

    private int id;
    private String nombre;
    private transient ArrayList<Compra> compras;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Persona(int id, String nombre, ArrayList<Compra> compras){
        this.id = id;
        this.nombre = nombre;
        this.compras = compras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
