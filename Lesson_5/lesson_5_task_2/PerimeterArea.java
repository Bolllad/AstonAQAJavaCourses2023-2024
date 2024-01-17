package lesson_5_task_2;

public interface PerimeterArea {

    default int perimeter(int sideA, int sideB) {
        return (sideA * 2) + (sideB * 2);
    }

    default double perimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    default int perimeter(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    default int area(int sideA, int sideB) {
        return sideA * sideB;
    }

    default double area(int radius) {
        return Math.PI * (radius ^ 2);
    }

    default double area(int base, double height) {
        return 0.5 * base * height;
    }
}
