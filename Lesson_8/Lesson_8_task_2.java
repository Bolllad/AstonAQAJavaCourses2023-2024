public class Lesson_8_task_2 {
    static public void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(6789237, "Johnson");
        phoneBook.add(7257323, "Johnson");
        phoneBook.add(9623756, "Redfield");
        phoneBook.add(4787823, "Black");
        phoneBook.add(9898824, "Johnson");
        phoneBook.add(8824762, "Black");

        System.out.println(phoneBook.get("Black"));
    }
}
