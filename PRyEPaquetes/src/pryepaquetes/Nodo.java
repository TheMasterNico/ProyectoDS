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
    String Lugar;
    ArrayDinamico<Conexion> conex;

    public Nodo(String Lugar) {
        this.conex = new ArrayDinamico(1);
        this.Lugar = Lugar;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public ArrayDinamico<Conexion> getConex() {
        return conex;
    }

    public void setConex(Conexion conex) {
        this.conex.PushBack(conex);
    }

    public void delConex(int i) {
        this.conex.Remove(i);
    }
     
    @Override
    public String toString() {
        return "\n \tNodo [Lugar=" + Lugar + ", Conexiones=" + conex + "]";
    }
    
    
}
