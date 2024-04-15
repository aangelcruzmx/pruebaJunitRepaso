import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {

    @Test
    void cuentaVocales() {
        assertEquals(Vocales.cuentaVocales("hola mundo"), 4);
    }
    @Test
    void cuentaVocales1() {
        assertEquals(Vocales.cuentaVocales("Esta es una cadenA"), 8);
    }
    @Test
    void cuentaVocales2() {
        assertEquals(Vocales.cuentaVocales("aeiouAEIOU"), 10);
    }

}