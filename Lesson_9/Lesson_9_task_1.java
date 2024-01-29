import java.util.Random;

public class Lesson_9_task_1 {
    static public void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(499) + 1;
        System.out.print("randomNumber = " + randomNumber + "\nnumbers array = ");

        int[] numbers = new int[10];
        for (int count = 0; count < numbers.length; count++) {
            numbers[count] = random.nextInt(9) + 1;
            System.out.print(numbers[count] + ", ");
        }
        System.out.print("\b\b\n\n");                    //purely decorative, backspaces 2 times and enters new line 2 times

        System.out.println("randomNumber has " + countEvenNumbers(randomNumber) + " even numbers.");
        System.out.println("numbers array has " + countEvenNumbers(numbers) + " even numbers.");
    }
    static int countEvenNumbers(int numbers) {
        char[] individualNumbers = Integer.toString(numbers).toCharArray();

        int result = 0;
        for (char number : individualNumbers) {
            if (number % 2 == 0) result++;
        }

        return result;
    }       //breaks down a single int value into individual numbers and counts how many of them are even

    static int countEvenNumbers(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            if (number % 2 == 0) result++;
        }

        return result;
    }     //counts even numbers from an array
}
