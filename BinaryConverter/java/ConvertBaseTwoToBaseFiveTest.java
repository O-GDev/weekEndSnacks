import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ConvertBaseTwoToBaseFiveTest{
    @Test
public void TestIfItConvertsToBaseTenFromBaseTwo(){
        int actual = ConvertBaseTwoToBaseFive.convertToBaseTen(1110);
        int expected = 14;
        Assertions.assertEquals(expected,actual);
    }
    @Test
   public void testConvertToBaseTenValidBinary() {
        Assertions.assertEquals(5, ConvertBaseTwoToBaseFive.convertToBaseTen(101));
        Assertions.assertEquals(10, ConvertBaseTwoToBaseFive.convertToBaseTen(1010));
    }

    @Test
    public void testConvertToBaseTenZero() {
        Assertions.assertEquals(0, ConvertBaseTwoToBaseFive.convertToBaseTen(0));
    }

    @Test
    public void testConvertToBaseTenInvalidBinary() {
        Assertions.assertEquals(0, ConvertBaseTwoToBaseFive.convertToBaseTen(1021));
    }

    @Test
    public void testConvertToBaseFiveValid() {
        Assertions.assertEquals("10", ConvertBaseTwoToBaseFive.convertToBaseFive(101));
        Assertions.assertEquals("20", ConvertBaseTwoToBaseFive.convertToBaseFive(1010));
    }

    @Test
    public void testConvertToBaseFiveZero() {
        Assertions.assertEquals("0", ConvertBaseTwoToBaseFive.convertToBaseFive(0));
    }
}

