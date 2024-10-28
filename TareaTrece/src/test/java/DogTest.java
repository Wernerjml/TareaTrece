import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest {

    Dog dog;

    @Before
    public void setUp() throws Exception {
        dog = new Dog();
    }

    @Test
    public void testTestToString() {
        dog.display();
        String esperado = dog.toString();
        String obtenido = "This a dog";
        assertEquals(obtenido,esperado);
    }
}