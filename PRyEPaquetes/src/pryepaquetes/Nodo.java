/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pryepaquetes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Castillo
 */

public class Nodo 
{
    private String Lugar;
    private List<Conexion> conex;

    public Nodo(String Lugar) {
        this.conex = new ArrayList<>();
        this.Lugar = Lugar;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public List<Conexion> getConex() {
        return conex;
    }

    public void setConex(Conexion conex) {
        this.conex.add(conex);
    }
    
    
    
}
