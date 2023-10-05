package org.iesvdm.models;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MatrizGenerica<T> {

    // Atributos

    private T[][] matriz;

    // Constructor
    public MatrizGenerica(int numFilas, int numCol){

        this.matriz =  (T[][]) new Object[numFilas][numCol];

    }

    // Getters y Setters

    public T[][] getMatriz() {
        return matriz;
    }


    // Metodos

    public void set(int fila, int col, T elemento){

        // Control tamaño
        try {

            // insercion
            this.matriz[fila][col] = elemento;

        }catch (Exception e){

            // Mensaje de error
            System.out.println("No es posible insertar en esa posicion, revisala!");

        }

    }

    public T get(int fila, int col){

        // control tamaño
        try {

            return matriz[fila][col];

        }catch (Exception e){

            System.out.println("Error, no se encuentra dicha posicion");

            return null;

        }

    }

    public int filas(){

        return this.matriz.length;

    }

    public int columnas(){

        return this.matriz[0].length;

    }

    @Override
    public String toString() {

        String resultado = "";

        for (int i = 0; i < this.matriz.length; i++) {

            for (int j = 0; j < this.matriz[i].length; j++) {

                resultado = resultado + this.matriz[i][j] + " ";

            }

            resultado = resultado + " \n";

        }

        return resultado;

    }
}
