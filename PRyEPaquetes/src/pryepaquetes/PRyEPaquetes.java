/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pryepaquetes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Castillo
 */
public class PRyEPaquetes 
{
    public static void main(String[] args)
    {
        
        long startTime = System.nanoTime();
        char[] LETRAS = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 
            'L', 'M', 'N', 'O', 'P' ,'Q', 'R', 'S', 'T', 'U', 'V', 'W', 
            'X', 'Y', 'Z'
        };
        // Este bloque de foor genera los datos de prueba
        /*for(int i=0; i<LETRAS.length; i++) 
        {
            for(int j = i+1; j<LETRAS.length; j++)
            {
                System.out.print(LETRAS[i]+","+LETRAS[j] + "," + Math.round(Math.random()*500 + 1) + "\n");
            }
        }*/
        
        int[] flag = new int[LETRAS.length];
        int[] flag2 = new int[LETRAS.length];
        Grafo ElGrafo = new Grafo();
        Nodo[] nodos = new Nodo[LETRAS.length];
        try {
            String Linea;
            FileReader file = new FileReader("Datos.txt");
            BufferedReader buffer = new BufferedReader(file);
            while((Linea = buffer.readLine())!=null) {
                //System.out.println(Linea);
                String[] parte = Linea.split(",");
                int index_or = charPosEnArray(parte[0].charAt(0), LETRAS, 0); // Nodo origen
                int index_dest = charPosEnArray(parte[1].charAt(0), LETRAS, 0); // Nodo destino
                
                if(flag[index_or] != 200)  // para que no vuelva a crear el nodo
                {
                    nodos[index_or] = new Nodo(parte[0]); // Creamos el nodo
                    flag[index_or] = 200;
                    ElGrafo.setNodo(nodos[index_or]);
                }
                if(flag[index_dest] != 200)  // para que no vuelva a crear el nodo
                {
                    nodos[index_dest] = new Nodo(parte[1]); // Creamos el nodo
                    flag[index_dest] = 200;
                    ElGrafo.setNodo(nodos[index_dest]);
                }
                
                nodos[index_or].setConex(new Conexion(nodos[index_or], 
                        nodos[index_dest], Integer.parseInt(parte[2]))); // Creamos la conexion entre los dos nodos
            }
            
            buffer.close();
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(PRyEPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(PRyEPaquetes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //System.out.println(ElGrafo);
        long endTime = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        ElGrafo.DelNodo(2); // Eliminando un Nodo
        long endTime2 = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        System.out.println(ElGrafo);
        long endTime3 = System.nanoTime() - startTime;
        
        System.out.println("Duración iniciar: " + endTime/1e6 + " ms");
        System.out.println("Duración remover: " + endTime2/1e6 + " ms");
        System.out.println("Duración print: " + endTime3/1e6 + " ms");
       
    }

    

    /**
     * Buscar un caracter en un arreglo, devuelve posision
     * @param aguja char a buscar
     * @param pajar array char 
     * @param posicionInicial intero posicion de inicio de busqueda
     * @return 
     */
    public static int charPosEnArray(char aguja, char [] pajar, int posicionInicial){
        if( aguja != 0 && pajar.length > 0){
            int encontro = -1;
            for(int i = posicionInicial; i < pajar.length; i++){
                if(pajar[i] == aguja){
                   encontro = i;
                   break;
                }
            }
            return  encontro;
        }else{
            return -1;
        }
    }


    
}
