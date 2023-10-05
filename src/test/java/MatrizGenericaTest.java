
import org.iesvdm.models.MatrizGenerica;
import org.junit.Assert;
import org.junit.jupiter.api.*;

/**
 * Conjunto de test unitarios realizados
 * a la clase MatrizGenerica, Se ha utilizado
 * la biblioteca jUnit5
 * @author guillermorodriguez
 */
public class MatrizGenericaTest {

    MatrizGenerica<String> tablaStr;
    MatrizGenerica<Integer> tablaInt;
    MatrizGenerica<Float> tablaFloat;

    @BeforeEach
    void setUp(){

        this.tablaStr = new MatrizGenerica<String>(2, 3);
        this.tablaInt = new MatrizGenerica<Integer>(3, 2);
        this.tablaFloat = new MatrizGenerica<Float>(2, 2);

    }

    @Test
    void constructorTest(){

        int numFilas = 3;
        int numCol = 2;

        // Casteo a Object para poder realizar el test

        Object[][] aI = tablaInt.getMatriz();

        int filasTabla = aI.length;
        int colsTabla = aI[0].length;

        // La tabla contiene 3 filas
        Assertions.assertEquals(numFilas, filasTabla);

        // La tala contiene 2 columnas
        Assertions.assertEquals(numCol, colsTabla);

    }

    @Test
    void setTest(){

        String elemento = "hola";
        int posicionFila = 0;
        int posicionCol = 0;

        // Insertar
        tablaStr.set(posicionFila, posicionCol, elemento);

        // cast
        Object[][] matriz = tablaStr.getMatriz();

        // El elemento se ha insertado en la posicion dada
        Assertions.assertEquals(elemento, matriz[posicionFila][posicionCol]);

    }

    @Test
    void getTest(){

        String elemento = "hola";
        String elementoObtenido = "";
        int posicionFila = 1;
        int posicionCol = 2;

        // Insertar
        tablaStr.set(posicionFila, posicionCol, elemento);

        // Obtener
        elementoObtenido = tablaStr.get(posicionFila, posicionCol);

        // El elemento es el correcto
        Assertions.assertEquals(elemento, elementoObtenido);

    }

    @Test
    void columnasTest(){

        // cast
        Object[][] matriz = tablaFloat.getMatriz();

        // Obtengo numero columnas
        int numCol = matriz[0].length;

        // El numero de columnas es el correcto
        Assertions.assertEquals(numCol, tablaFloat.columnas());

    }

    @Test
    void filasTest(){

        // cast
        Object[][] matriz = tablaStr.getMatriz();

        // Obtengo numero de filas
        int numFilas = matriz.length;

        // El numero de filas es el correcto
        Assertions.assertEquals(numFilas, tablaStr.filas());

    }

    @Test
     public void toStringTest(){

        // Añado elementos
        tablaFloat.set(0, 0, 1.1f);
        tablaFloat.set(0, 1, 1.2f);
        tablaFloat.set(1, 0, 2.1f);
        tablaFloat.set(1, 1, 2.2f);

        // Cadena esperada
        String esperada = "1.1 1.2\n2.1 2.2\n";

        Assertions.assertEquals(esperada, tablaFloat.toString());

    }

}
