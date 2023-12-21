import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        System.out.println(checkSumRange(3, 15));         // Проерка задания 1

        checkOverZero(6);                                    // Проерка задания 2
        checkOverZero(-1);

        System.out.println(isNegative(-1));                  // Проерка задания 3
        System.out.println(isNegative(1));

        printStringNTimes("Example string", 4);        // Проерка задания 4

        System.out.println(isLeapYear(2016));                   // Проерка задания 5

        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};     // Задание 6
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1) {
                binaryArray[i] = 0;
            } else {
                binaryArray[i] = 1;
            }
        }
        System.out.println("\n" + Arrays.toString(binaryArray));

        int[] toHundredArray = new int[100];                    // Задание 7
        for (int i = 0; i < toHundredArray.length; i++) {
            toHundredArray[i] = i + 1;
        }
        System.out.println("\n" + Arrays.toString(toHundredArray));

        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};  // Задание 8
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
        System.out.println("\n" + Arrays.toString(numbers) + "\n");

        int[][] matrix = new int[6][6];                         // Задание 9
        for (int i = 0; i < matrix.length; i++) {
            for (int f = 0; f < matrix.length; f++) {
                if (i == f || (matrix.length - f - 1) == i) {
                    matrix[i][f] = 1;
                } else {
                    matrix[i][f] = 0;
                }
                System.out.print("[" + matrix[i][f] + "] ");
            }
            System.out.println();
        }

        int[] myArray = createIntArray(4, 10);
        System.out.println("\n" + Arrays.toString(myArray));
    }

    static boolean checkSumRange(int a, int b) {                // Задание 1
        return (a + b) >= 10 && (a + b) <= 20;
    }

    static void checkOverZero(int a) {                          // Задание 2
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean isNegative(int a) {                          // Задание 3
        return a < 0;
    }

    static void printStringNTimes(String string, int n) {       // Задание 4
        for (int i = 0; i < n; i++) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    static boolean isLeapYear(int year) {                       // Задание 5
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static int[] createIntArray(int len, int initialValue) {    // Задание 10
        int[] newArray = new int[len];
        Arrays.fill(newArray, initialValue);

        return newArray;
    }
}
