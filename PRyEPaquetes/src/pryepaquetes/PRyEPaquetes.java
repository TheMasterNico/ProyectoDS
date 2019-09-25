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
public class PRyEPaquetes 
{
    public static void main(String[] args)
    {
       Grafo ElGrafo = new Grafo();
       Nodo P1 = new Nodo("Carrera 50 #181-14");
       Nodo P2 = new Nodo("Carrera 19 #146-86");
       Nodo P3 = new Nodo("Diagonal 151 #145-53");
       Nodo P4 = new Nodo("Universidad Nacional de Colombia");
       
       P1.setConex(new Conexion(P1, P2, 190));
       P1.setConex(new Conexion(P1, P3, 20));
       P1.setConex(new Conexion(P1, P4, 120));
       
       ElGrafo.setNodo(P1);
       ElGrafo.setNodo(P2);
       ElGrafo.setNodo(P3);
       ElGrafo.setNodo(P4);
       
        System.out.println();
       
    }

}
