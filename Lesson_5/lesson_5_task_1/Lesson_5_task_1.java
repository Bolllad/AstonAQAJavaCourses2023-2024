package lesson_5_task_1;

import java.util.Random;

public class Lesson_5_task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Bowl catBowl = new Bowl(30);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Тоша");
        cats[1] = new Cat("Муська");
        cats[2] = new Cat("Пуська");
        cats[3] = new Cat("Маркиз");
        cats[4] = new Cat("Тима");

        for (Cat cat : cats) {
            cat.eatFromBowl(catBowl, random.nextInt(15) + 1);
            if (cat.full) {
                System.out.println("Кот " + cat.name + " сыт");
            } else {
                System.out.println("Кот " + cat.name + " не сыт");
            }
        }
    }
}