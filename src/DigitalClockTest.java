import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class DigitalClockTest {
    DigitalClock dcTest = new DigitalClock();

    @Test
    public void integrationsTest(){

        //Test case to test SetClock() that calls the functions: setHours(), setMinutes(), and setSeconds().
        assertEquals("Clock is Set", dcTest.SetClock());

        //test case to test getTime() that calls the functions: getHours(), getMinutes(), and getSeconds().
        //I couldn't put the actual time as the expected output since the time will constantly change.
        assertEquals("Clock displayed", dcTest.getTime());
    }

}