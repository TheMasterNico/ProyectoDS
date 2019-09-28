/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pryepaquetes;

/**
 *
 * @author Nicolas Castillo
 */

public class Conexion 
{
    private Nodo Origen;
    private Nodo Destino;
    private double Distancia;

    public Conexion(Nodo Origen, Nodo Destino, double Distancia) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.Distancia = Distancia;
    }  
    @Override
    public String toString() {
        return "\n\t\tConexion [Origen=" + Origen.getLugar() + ", Destino=" + Destino.getLugar() + ", Distancia="
                + Distancia + "]";
    }   
}
