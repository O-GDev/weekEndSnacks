
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ArrayKataTest{
   
     ArrayKata myKata = new ArrayKata();

    @Test
    public void testThatMethodCanSumIntegersInAnArray(){

       int [] array = {3,2,4,8,10,11,};

       int actual = myKata.sumOfEven(array);

       int expected = 24;

        Assertions.assertEquals(actual,expected); 
    }


}
