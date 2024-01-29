import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Lesson_9_task_5 {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<String> logins = new ArrayList<>();

        String line = "";
        while (!Objects.equals(line = scanner.nextLine(), "")) {
            logins.add(line);
        }

        for (String login : logins) {
            if (login.matches("\\bf\\S*")) System.out.print(login + ", ");
        }
        System.out.print("\b\b.");
    }
}
