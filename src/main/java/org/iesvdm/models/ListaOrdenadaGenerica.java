package org.iesvdm.models;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase que nos permite instanciar una lista
 * de tipo generico
 * @param <E> el tipo E debe implementar Comparable
 */
public class ListaOrdenadaGenerica<E extends Comparable<E>> {

    // Atributos

    private ArrayList<E> lista;

    // Constructor

    public ListaOrdenadaGenerica(){

        this.lista = new ArrayList<>();

    }

    // Getters y Setters

    public ArrayList<E> getLista() {
        return lista;
    }

    // Metodos

    /**
     * Añade un elemento a la lista y la ordena
     * @param elemento
     */
    public void add(E elemento){

        this.lista.add(elemento);
        Collections.sort(this.lista);

    }

    /**
     * Devuelve el elemento en el indice dado
     * @param indice
     * @return elemento
     */
    public E get(int indice){

        return this.lista.get(indice);

    }

    /**
     * Devuelve el tamaño de la lista
     * @return int
     */
    public int size(){

        return this.lista.size();

    }

    /**
     * Devuelve True si la lista esta vacia
     * o False si contiene algun elemento
     * @return boolean
     */
    public boolean isEmpty(){

        return this.lista.isEmpty();

    }

    /**
     * Borra un elemento de la lista si es posible
     * devuelve True si se ha podido borrar o False
     * en caso contrario
     * @param elemento
     * @return boolean
     */
    public boolean remove(E elemento){

        return this.lista.remove(elemento);

    }

    /**
     * Devuelve el indice dentro de la lista
     * en la cual se encuentra el elemento dado,
     * en caso de que no se encuentre devuelve -1
     * @param elemento
     * @return int
     */
    public int indexOf(E elemento){

        return this.lista.indexOf(elemento);

    }

    @Override
    public String toString() {

        return this.lista.toString();

    }
}
