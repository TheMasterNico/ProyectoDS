/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pryepaquetes;

import java.util.Arrays;

/**
 *
 * @author Nicolas Castillo
 */

public class ArrayDinamico <T>
{
    private T[] arr; 
    private int size;
    private int capacity;

    public ArrayDinamico(int N) {
        this.arr = (T[])new Object[N];
        this.size = 0;
        this.capacity = N;
    }
    
    public T Get(int i)
    {
        if(i < 0 || i >= size)
        {
            System.out.println("1Error: Index out of range");
            return null;
        }
        return arr[i];
    }
    
    public void Set(int i, T val)
    {
        if(i < 0 || i >= this.size)
        {
            System.out.println("2Error: Index out of range");
            
        }
        else 
            this.arr[i] = val;
    }
    
    public void PushBack(T val)
    {
        if(this.size == this.capacity)
        {
            T[] new_arr = (T[])new Object[2*this.capacity];
            System.arraycopy(arr, 0, new_arr, 0, this.size);
            /*for(int i=0; i < this.size; i++)
            {
                new_arr[i] = arr[i];
            }*/
            this.arr = null;
            this.arr = new_arr;
            this.capacity = 2*this.capacity;
        }
        this.arr[this.size] = val;
        this.size++;
    }
    
    public void Remove(int i)
    {
        if(i < 0 || i >= this.size)
        {
            System.out.println("3Error: Index out of range");
            return;
        }
        for(int j = i; j < this.size-2; j++)
        {
            arr[j] = arr[j+1];
        }
        size--;
    }
    
    public int Size()
    {
        return this.size;
    }
    
    public void Print()
    {
        for(int i = 0; i < this.size; i++)
        {
            System.out.println("Pos["+ i +"] = "+this.arr[i]);
        }
    }
    @Override
    public String toString() {
        return  Arrays.toString(arr);
    }
}
