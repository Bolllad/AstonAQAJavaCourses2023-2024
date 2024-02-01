import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class FactorialTestng {
    Factorial factorial;

    @BeforeMethod
    void setUp(){
        factorial = new Factorial();
    }

    @Test(description = "Testing if factorial of 5 equals 120")
    void testFactorialOfFive(){
        assert factorial.CalculateFactorial(5) == 120;
    }

    @Test(description = "Testing if factorial of 7 equals 5040")
    void testFactorialOfSeven(){
        assert factorial.CalculateFactorial(7) == 5040;
    }

    @Test(description = "Testing if factorial of 10 equals 3628800")
    void testFactorialOfTen(){
        assert factorial.CalculateFactorial(10) == 3628800;
    }
}
