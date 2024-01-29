import java.util.*;
import java.util.stream.Collectors;

public class Lesson_9_task_3 {
    static public void main(String[] args) {
        String[] stringArray = {"f10", "f15", "f2", "f4", "f4"};
        List<String> stringCollection = new ArrayList<>(Arrays.asList(stringArray));
        stringCollection.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Integer.parseInt(o1.replaceAll("\\D+", "")) > Integer.parseInt(o2.replaceAll("\\D+", ""))) {
                    return 1;
                } else if (Integer.parseInt(o1.replaceAll("\\D+", "")) == Integer.parseInt(o2.replaceAll("\\D+", ""))) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        stringArray = stringCollection.toString().replaceAll("[\\[\\]]", "").split(", ");
        for (String element : stringArray) {
            System.out.print(element + ", ");
        }
        System.out.print("\b\b\n");
    }
}
