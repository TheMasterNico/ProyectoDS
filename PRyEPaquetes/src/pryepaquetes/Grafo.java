/*
 * Agradecimientos a raidentrance 
 *(https://devs4j.com/2017/11/24/implementa-un-grafo-de-ciudades-en-java/)
 * En su web pude ver y basarme en el código para realizar mi propia version 
 */

package pryepaquetes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Castillo
 */

public class Grafo 
{
    ArrayDinamico<Nodo> nodo = new ArrayDinamico(1);

    public void setNodo(Nodo nodo) {
        this.nodo.PushBack(nodo);
    }
    
    public void DelNodo(int i)
    {
        this.nodo.Remove(i);
    }
    
    public void delConex(int i)
    {
        
    }
     
    @Override
    public String toString() {
        return "Graph [Nodos=" + nodo + "]";
    }
    
    
}
