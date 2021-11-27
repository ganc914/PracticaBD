package Practica002;


import Practica002.Pila;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusta
 */
public class PilaArray implements Pila {
    private int TOP= -1;
    private Object s[];
    private int capacidad = 0;
    
    public PilaArray () {
        this(1000);
        
    }
        
        public PilaArray(int cap) {
            capacidad=cap;
            s=new Object [capacidad];
        }
        
    @Override
        public int longitud() {
            return (TOP+1);
        }
        
    @Override
        public boolean esVacia() {
            return (TOP < 0);
        }
        
    @Override
        public void push(Object o) {
            if(longitud()<capacidad) s[++TOP] = o;
         }
    
        
    @Override
        public Object pop() {
            Object aux;
            
            if(esVacia()) return null;
            aux=s[TOP];
            s[TOP--]=null;
            return aux;
        }
        
    @Override
        public Object primero() {
            if(esVacia()) return null;
            else return s[TOP];
           
        }

    }

