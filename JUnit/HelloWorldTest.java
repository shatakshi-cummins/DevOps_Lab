package DevOps_Lab.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void TestPrint() {
        HelloWorld hw = new HelloWorld();
        String result = hw.printString("Hello World");
        assertEquals("Hello World", result);
    }
}
