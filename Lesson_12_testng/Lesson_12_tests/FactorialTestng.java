import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class FactorialTestng {
    Factorial factorial = new Factorial();

    @DataProvider (name = "int-data-provider")
    public Object[][] dpMethod() {
        return new Object[][] {{5, 120}, {7, 5040}, {10, 3628800}};
    }

    @Test(description = "Testing factorial method", dataProvider = "int-data-provider")
    void testFactorial(int factorialOf, int expected){
        assert factorial.CalculateFactorial(factorialOf) == expected;
    }
}
