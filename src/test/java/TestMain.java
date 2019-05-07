import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void test1(){
        int[] numbers = {1,1,1,1,3};
        assertEquals(3,  Main.stray(numbers));
    }

}
