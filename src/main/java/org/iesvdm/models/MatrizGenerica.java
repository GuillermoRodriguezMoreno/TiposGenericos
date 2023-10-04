package org.iesvdm.models;

import java.util.ArrayList;

public class MatrizGenerica<T, U> {

    // Atributos

    private ArrayList<T> columna;
    private ArrayList<U> fila;

    // Constructor
    public MatrizGenerica(int numCol, int numFilas){

        this.columna = new ArrayList<T>(numCol);
        this.fila = new ArrayList<U>(numFilas);

    }

}
