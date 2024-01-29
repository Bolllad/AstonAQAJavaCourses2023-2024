import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Lesson_9_task_4 {
    static public void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        int averageAgeMen = 0, menCount = 0; String mandatoryArmyList = "";
        for (Student student : students) {
            if (student.getGender() == Gender.MAN) {
                averageAgeMen += student.getAge();
                menCount++;
            }
            if (student.getGender() == Gender.MAN && student.getAge() >= 18 && student.getAge() <= 27) mandatoryArmyList += student.getName() + ", ";
        }
        averageAgeMen /= menCount;
        mandatoryArmyList = mandatoryArmyList.substring(0, mandatoryArmyList.length() - 2) + '.';

        System.out.println("Average age between men = " + averageAgeMen + "\nMen suitable for mandatory service: " + mandatoryArmyList);

    }
    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name ='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    ']';
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Student)) return false;
            Student student = (Student) obj;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}
