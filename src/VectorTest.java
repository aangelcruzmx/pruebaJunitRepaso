import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    @Test
    void vectorTest1(){
        int[]v={5,4,3,2,1};
        int[]reverso={1,2,3,4,5};

        assertArrayEquals(reverso,Vector.reverso(v));
    }


}