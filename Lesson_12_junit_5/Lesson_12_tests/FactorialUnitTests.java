import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialUnitTests {
    Factorial factorial;

    @BeforeEach
    void setUp(){
        factorial = new Factorial();
    }

    @Test
    @DisplayName("Testing factorial of 5")
    void testFactorialOfFive(){
        assertEquals(120, factorial.CalculateFactorial(5));
    }

    @Test
    @DisplayName("Testing factorial of 7")
    void testFactorialOfSeven(){
        assertEquals(5040, factorial.CalculateFactorial(7));
    }

    @Test
    @DisplayName("Testing factorial of 10")
    void testFactorialOfTen(){
        assertEquals(3628800, factorial.CalculateFactorial(10));
    }
}
