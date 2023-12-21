public class Lesson_4 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("John Smith", "Senior Developer", "john.smith@company.com", "295712857", 52.1, 43);
        employees[1] = new Employee("Sean Murray", "Manager", "sean.murray@company.com", "76346763", 67.5, 39);
        employees[2] = new Employee("Sarah Radcliff", "Junior Developer", "sarah.radcliff@company.com", "92362361", 35.7, 26);
        employees[3] = new Employee("Bobby Kotik", "Middle Developer", "bobby.kotik@company.com", "91276525", 43, 36);
        employees[4] = new Employee("Jacob Washer", "Project Lead", "jacob.washer@company.com", "636788912", 70.4, 44);
    }
}