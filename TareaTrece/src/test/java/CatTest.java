import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    Cat cat;

    @Before
    public void setUp() throws Exception {
        cat = new Cat();
    }

    @Test
    public void testTestToString() {
        cat.display();
        String esperado = cat.toString();
        String obtenido = "This a cat";
        assertEquals(obtenido,esperado);
    }
}