import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {
    protected HashMap<Integer, String> phoneBook = new HashMap<>();

    public void add(Integer phoneNumber, String surname) {
        this.phoneBook.put(phoneNumber, surname);
    }

    public String get(String surname) {
        String result = "";
        for (Map.Entry<Integer, String> entry : phoneBook.entrySet()) {
            if (Objects.equals(surname, entry.getValue())) result += entry.getValue() + " - " + entry.getKey() + "\n";
        }

        return result.equals("") ? "No entries with surname of \"" + surname + "\" were found." : result;
    }
}