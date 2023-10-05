
import org.iesvdm.models.MatrizGenerica;
import org.junit.jupiter.api.*;

public class MatrizGenericaTest {

    MatrizGenerica<String> tablaStr;
    MatrizGenerica<Integer> tablaInt;
    MatrizGenerica<Float> tablaFloat;

    @BeforeEach
    void setUp(){

        tablaStr = new MatrizGenerica<String>(4, 4);
        tablaInt = new MatrizGenerica<Integer>(3, 2);
        tablaFloat = new MatrizGenerica<Float>(2, 2);

    }

    @Test
    void testConstructor(){

        int numFilas = 3;
        int numCol = 2;

        int filasTabla = tablaInt.getMatriz()[0].length;
        // La tabla contiene 3 filas
        Assertions.assertEquals(numFilas, filasTabla);

        // La tala contiene 2 columnas
        //Assertions.assertEquals(numCol, tablaInt.getMatriz()[0][0].length);

    }

    @Test
    void testSet(){

        String elemento = "hola";
        int posicionFila = 0;
        int posicionCol = 0;

        // Insertar
        tablaStr.set(posicionFila, posicionCol, elemento);

        // El elemento se ha insertado en la posicion dada
        Assertions.assertEquals(elemento, tablaStr.getMatriz()[posicionFila][posicionCol]);

    }

    @Test
    void testGet(){

        String elemento = "hola";
        String elementoObtenido = "";
        int posicionFila = 2;
        int posicionCol = 2;

        // Insertar
        tablaStr.set(posicionFila, posicionCol, elemento);

        // Obtener
        elementoObtenido = tablaStr.get(posicionFila, posicionCol);

        // El elemento es el correcto
        Assertions.assertEquals(elemento, elementoObtenido);

    }

    @Test
    void testColumnas(){

        // Obtengo numero columnas
        int numCol = tablaFloat.getMatriz()[0].length;

        // El numero de columnas es el correcto
        Assertions.assertEquals(numCol, tablaFloat.columnas());

    }

    @Test
    void testFilas(){

        // Obtengo numero de filas
        int numFilas = tablaStr.getMatriz().length;

        // El numero de filas es el correcto
        Assertions.assertEquals(numFilas, tablaStr.filas());

    }

    @Test
    void testToString(){

        // Añado elementos
        tablaFloat.set(0, 0, 1.1f);
        tablaFloat.set(0, 1, 1.2f);
        tablaFloat.set(1, 0, 2.1f);
        tablaFloat.set(1, 1, 2.2f);

        // Cadena esperada
        String esperada = "1.1 1.2 \n2.1 2.2 \n";

        Assertions.assertEquals(esperada, tablaFloat.toString());

    }



}
