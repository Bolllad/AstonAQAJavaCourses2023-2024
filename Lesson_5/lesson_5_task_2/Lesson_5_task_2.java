package lesson_5_task_2;

public class Lesson_5_task_2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5, "Чёрный", "Белый");
        shapes[1] = new Rectangle(4, 6, "Прозрачный", "Красный");
        shapes[2] = new Triangle(2, 6, 8, "Белый", "Чёрный");
        shapes[3] = new Triangle(8, 5, 9, "Фиолетовый", "Серый");
        shapes[4] = new Circle(69, "Розовый", "Синий");

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
