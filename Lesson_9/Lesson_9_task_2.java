import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Lesson_9_task_2 {
    static public void main(String[] args) {
        String[] stringArray = {"Highload", "High", "Load", "Highload"};
        ArrayList<String> stringCollection = new ArrayList<String>(Arrays.asList(stringArray));

        int highCount = 0;
        for (String string : stringArray) {
            if (Objects.equals(string, "High")) highCount++;
        }
        System.out.println("\"High\" count = " + highCount);

        System.out.println(findFirst(stringCollection));
        System.out.println(getLast(stringCollection));
    }

    static String findFirst(ArrayList<String> stringCollection) {
        return stringCollection.isEmpty() ? "0" : stringCollection.get(0);
    }

    static String getLast(ArrayList<String> stringCollection) {
        return stringCollection.isEmpty() ? "0" : stringCollection.get(stringCollection.size() - 1);
    }
}
