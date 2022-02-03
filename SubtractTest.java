import static org.junit.Assert.*;
import org.junit.*;

public class SubtractTest {
    @Test
    public void testSubtract(){
        assertEquals(4, Subtract.subtractResult(10,6));
    }
}