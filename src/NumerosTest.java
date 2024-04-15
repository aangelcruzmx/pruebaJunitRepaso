import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {


    @Test
    void sonIguales() {
        assertEquals(Numeros.sonIguales(4,55, 7),2);
    }

    @Test
    void sonIguales2() {
        assertEquals(Numeros.sonIguales(14,55,14),1);
    }
    @Test
    void sonIguales3() {
        assertEquals(Numeros.sonIguales(1,55,55),1);
    }
    @Test
    void sonIguales4() {
        assertEquals(Numeros.sonIguales(1,1,1),0);
    }
}