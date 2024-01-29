public class Lesson_8_task_1 {
    static public void main(String[] args) {
        String[] words = {"phone", "phone", "book", "phone", "book", "paper", "robot", "book", "robot", "phone"};

        String result = "";
        for (String word : words) {
            int count = 0;
            if (!result.contains(word)) {
                result += word;
                for (String sameWord : words) {
                    if (word == sameWord) {
                        count ++;
                    }
                }
                result += " - " + count + ", ";
            }
        }
        result = result.substring(0, result.length() - 2) + ".";

        System.out.println(result);
    }
}