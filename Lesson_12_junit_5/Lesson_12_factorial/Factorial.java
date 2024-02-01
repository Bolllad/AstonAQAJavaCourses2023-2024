public class Factorial {
    public int CalculateFactorial(int num) {
        int result = 1;
        for (int count = 1; count <= num; count++) {
            result *= count;
        }
        return result;
    }
}
