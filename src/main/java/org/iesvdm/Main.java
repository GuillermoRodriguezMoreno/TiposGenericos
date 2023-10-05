package org.iesvdm;

import org.iesvdm.models.MatrizGenerica;
import org.iesvdm.models.PilaGenerica;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PilaGenerica<Integer> pilaInt = new PilaGenerica<>();
        PilaGenerica<String> pilaStr = new PilaGenerica<>();
        PilaGenerica<Double> pilaDbl = new PilaGenerica<>();

        pilaInt.aniadir(1);
        pilaInt.aniadir(3);

        pilaDbl.aniadir(2.3);
        pilaDbl.aniadir(0.4);

        pilaStr.aniadir("hola");
        pilaStr.aniadir("caracola");

        System.out.println(pilaInt);
        System.out.println(pilaStr);
        System.out.println(pilaDbl);

        MatrizGenerica<String> tabla = new MatrizGenerica<>(3, 2);

        System.out.println(tabla);

        MatrizGenerica<Integer> tabla2 = new MatrizGenerica<>(2, 2);
        System.out.println(tabla2);

    }
}