package mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class KrKTest {
    @Test
    public void testCalcBeitag() {
        // CalcSteuer cs = new CalcSteuer(); // MIST
        CalcSteuer csMock = mock(CalcSteuer.class); // DLS Domain Specific Language!
        when(csMock.calcNetto(10000)).thenReturn(5000);
        KrK k = new KrK(csMock);
        assertEquals(1000, k.calcBeitag(10000));
    }
}
