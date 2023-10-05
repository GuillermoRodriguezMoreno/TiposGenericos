package org.iesvdm.models;

import java.util.ArrayList;
import java.util.Collections;

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
    public void add(E elemento){

        this.lista.add(elemento);
        Collections.sort(this.lista);

    }

    public E get(int indice){

        return this.lista.get(indice);

    }

    public int size(){

        return this.lista.size();

    }

    public boolean isEmpty(){

        return this.lista.isEmpty();

    }

    public boolean remove(E elemento){

        return this.lista.remove(elemento);

    }

    public int indexOf(E elemento){

        return this.lista.indexOf(elemento);

    }

    @Override
    public String toString() {

        return this.lista.toString();

    }
}
