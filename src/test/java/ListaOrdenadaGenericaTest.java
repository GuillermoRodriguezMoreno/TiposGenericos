
import org.iesvdm.models.ListaOrdenadaGenerica;
import org.junit.jupiter.api.*;

public class ListaOrdenadaGenericaTest {

    ListaOrdenadaGenerica<String> listaStr;
    ListaOrdenadaGenerica<Integer> listaInt;
    ListaOrdenadaGenerica<Float> listFloat;

    @BeforeEach
    public void setUp(){

        listaStr = new ListaOrdenadaGenerica<>();
        listaInt = new ListaOrdenadaGenerica<>();
        listFloat = new ListaOrdenadaGenerica<>();

    }

    @Test
    public void addTest(){

        // Añado elementos
        listaInt.add(2);
        listaInt.add(1);

        // Los elementos se encuentran en la lista y estan ordenados
        Assertions.assertEquals(1, listaInt.getLista().get(0));
        Assertions.assertEquals(2, listaInt.getLista().get(1));

    }

    @Test
    public void getTest(){

        // Elementos
        String e1 = "hola";
        String e2 = "a";

        // Añado elementos
        listaStr.add(e1);
        listaStr.add(e2);

        // El primer elemento deberia ser "a"
        Assertions.assertEquals(e2, listaStr.get(0));

        // El segundo elemento deberia ser "hola"
        Assertions.assertEquals(e1, listaStr.get(1));

    }

    @Test
    public void sizeTest(){

        int tamañoInicial, tamañoActual;

        // Tamaño 0
        tamañoInicial = listFloat.size();

        // Añado elementos
        listFloat.add(2.3f);
        listFloat.add(1.2f);
        listFloat.add(5.4f);

        // Tamaño actual (3)
        tamañoActual = listFloat.size();

        // Los tamaños deberian ser los correctos
        Assertions.assertEquals(0, tamañoInicial);
        Assertions.assertEquals(3, tamañoActual);

    }

    @Test
    public void isEmptyTest(){

        // Lista vacia
        boolean estaVacia = listaInt.isEmpty();

        // Añado un elemento

        listaInt.add(0);

        boolean noEstaVacia = listaInt.isEmpty();

        // estaVacia debe ser true y noEstaVacia debe ser false

        Assertions.assertTrue(estaVacia);
        Assertions.assertFalse(noEstaVacia);

    }

    @Test
    public void removeTest(){

        String elemento = "hola";
        String elemento2 = "adios";

        // Añado elementos

        listaStr.add(elemento);
        listaStr.add(elemento2);

        // borro "hola"
        listaStr.remove(elemento);

        // La lista no debe contener "hola"
        Assertions.assertFalse(listaStr.getLista().contains(elemento));

        // La lista debe tener tamaño 1
        Assertions.assertEquals(1, listaStr.size());

        // puedo borrar "adios"
        Assertions.assertTrue(listaStr.remove(elemento2));

    }

    @Test
    public void indexOfTest(){

        // Añado elementos

        listaInt.add(1);
        listaInt.add(3);
        listaInt.add(2);

        // El elemento en posicion 0 debe ser 1
        Assertions.assertEquals(0, listaInt.indexOf(1));

        // El elemento en poscicion 1 debe ser 2
        Assertions.assertEquals(1, listaInt.indexOf(2));

        // El elemento en posicion 2 debe ser 3
        Assertions.assertEquals(2, listaInt.indexOf(3));

        // El elemento 4 (no existe) debe ser -1
        Assertions.assertEquals(-1, listaInt.indexOf(4));

    }

    @Test
    public void toStringTest(){

        // Añado elementos
        listaInt.add(1);
        listaInt.add(3);
        listaInt.add(2);

        // Cadena esperada
        String esperada = "[1, 2, 3]";

        // La cadena esperada y el toString deben ser iguales
        Assertions.assertEquals(esperada, listaInt.toString());

    }
}
