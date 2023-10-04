package org.iesvdm.models;

import java.util.LinkedList;

public  class PilaGenerica<T> {

    // Atributos

    private LinkedList<T> list;

    // Constructor

    public PilaGenerica() {

        this.list = new LinkedList<>();

    }

    // Metodos

    public boolean estaVacia(){

        return this.list.isEmpty();

    }

    public T extraer(){

        return this.list.removeLast();

    }

    public T primero(){

        return this.list.getLast();

    }

    public void aniadir(T elemento){

        this.list.addLast(elemento);

    }

    @Override
    public String toString() {

        return "pilaGenerica{" + list + '}';

    }
}