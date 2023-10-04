
import org.iesvdm.models.PilaGenerica;
import org.junit.jupiter.api.*;

public class PilaGenericaTest {

    // Seteo varios tipos de pila

    PilaGenerica<Integer> pilaInt;
    PilaGenerica<String> pilaString;
    PilaGenerica<Float> pilaFloat;

    @BeforeEach
    void setUp(){

         pilaInt = new PilaGenerica<>();
         pilaString = new PilaGenerica<>();
         pilaFloat = new PilaGenerica<>();

    }

    @Test
    void testAñadirElemento(){

        Integer elemento = 1;

        pilaInt.aniadir(elemento);

        Assertions.assertEquals(1, pilaInt.getList().get(0));

    }

    @Test
    void testEstaVacia(){

        // Confirmar que la pila esta vacia
        Assertions.assertTrue(pilaString.estaVacia());

    }

    @Test
    void testExtraer(){

        // Elementos
        Float e1 = 1.3f;
        Float e2 = 3.4f;
        Float e3 = 5.2f;

        // Añado
        pilaFloat.aniadir(e1);
        pilaFloat.aniadir(e2);
        pilaFloat.aniadir(e3);

        // Extraer primer elemento
        Assertions.assertEquals(5.2f, pilaFloat.extraer());

        // El elemento ya no esta en la pila
        Assertions.assertFalse(pilaFloat.getList().contains(e3));

    }

    @Test
    void testPrimero(){

        // Elementos
        String e1  = "hola";
        String e2 = "caracola";

        pilaString.aniadir(e1);
        pilaString.aniadir(e2);

        // El primer elemento es caracola
        Assertions.assertEquals("caracola", pilaString.primero());

    }

    @Test
    void testToString(){

        // Cadena esperada
        String cadena = "pila = [1, 2]";

        Integer e1 = 1;
        Integer e2 = 2;

        pilaInt.aniadir(e1);
        pilaInt.aniadir(e2);

        // Las cadenas son iguales
        Assertions.assertEquals(cadena, pilaInt.toString());

    }

}
