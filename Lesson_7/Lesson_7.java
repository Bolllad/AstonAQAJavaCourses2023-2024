import java.util.regex.Pattern;

public class Lesson_7 {
    static public void main(String[] args) {
        try {
            System.out.println(twoDimensionalStringArraySum(new String[][]{
                    {"25", "62", "42", "51"},
                    {"63", "6", "10", "5"},
                    {"15", "3", "96", "0"},
                    {"1", "76", "89", "11"}}));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(twoDimensionalStringArraySum(new String[][]{
                    {"25", "62", "42", "51"},
                    {"63", "6", "10", "5"},
                    {"15", "3", "96", "a"},
                    {"1", "76", "89", "11"}}));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int twoDimensionalStringArraySum(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        if (stringArray.length != 4) {
            throw new MyArraySizeException("Incorrect size! Must be 4 x 4.");
        }
        for (String[] row : stringArray) {
            if (row.length != 4) {
                throw new MyArraySizeException("Incorrect size! Must be 4 x 4.");
            }
        }

        int result = 0, arrayRow = 1;
        Pattern pattern = Pattern.compile("-?\\d+");

        for (String[] row : stringArray) {
            int arrayColumn = 1;
            for (String element : row) {
                if (element == null || !pattern.matcher(element).matches()) {
                    throw new MyArrayDataException("Incorrect data in row: " + arrayRow + ", column: " + arrayColumn + "! Value should be int!");
                }
                result += Integer.parseInt(element);
                arrayColumn++;
            }
            arrayRow++;
        }
        return result;
    }
}
