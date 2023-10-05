package org.iesvdm.models;

import java.util.LinkedList;

/**
 * Nos permite instanciar un pila
 * de tipo generico
 * @param <T> tipo generico
 */
public  class PilaGenerica<T> {

    // Atributos

    private LinkedList<T> list;

    // Constructor

    public PilaGenerica() {

        this.list = new LinkedList<>();

    }

    // Getters y Setters

    public LinkedList<T> getList() {
        return list;
    }

    public void setList(LinkedList<T> list) {
        this.list = list;
    }


    // Metodos

    /**
     * Nos muestra si la pila contiene algun
     * elemento o no
     * @return True si esta vacia,
     * False si contiene algun elemento
     */
    public boolean estaVacia(){

        return this.list.isEmpty();

    }

    /**
     * Devuelve y borra el primer elemento de la pila
     * @return Elemento de tipo T
     */
    public T extraer(){

        return this.list.removeLast();

    }

    /**
     * Devuelve el primer elemento de la pila sin borrarlo
     * @return Elemento tipo T
     */
    public T primero(){

        return this.list.getLast();

    }

    /**
     * Añade un elemento a la pila
     * @param elemento
     */
    public void aniadir(T elemento){

        this.list.addLast(elemento);

    }

    @Override
    public String toString() {

        return "pila = " + list;

    }
}
