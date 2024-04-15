import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {

    @Test
    void sinVocales() {
        assertEquals(Vocales2.sinVocales("hola mundo"), "hl mnd");
    }
    @Test
    void sinVocales2() {
        assertEquals(Vocales2.sinVocales("hola HOLAA vcciiiiiiiiiiiiiii"), "hl HL vcc");
    }

}