import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FactorialUnitTests {
    Factorial factorial = new Factorial();

    @ParameterizedTest
    @CsvSource({"120, 5", "5040, 7", "3628800, 10"})
    @DisplayName("Testing factorial method")
    void testFactorial(int expected, int factorialOf){
        Assert.assertEquals(expected, factorial.CalculateFactorial(factorialOf));
    }
}
