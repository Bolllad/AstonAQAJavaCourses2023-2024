package lesson_5_task_2;

public class Rectangle extends Shape implements PerimeterArea{
    int perimeter;
    int area;

    public Rectangle(int sideA, int sideB, String borderColor, String fillColor) {
        super(borderColor, fillColor);
        perimeter = perimeter(sideA, sideB);
        area = area(sideA, sideB);
    }

    @Override
    public String toString() {
        return perimeter + ", " + area + ", " + borderColor + ", " + fillColor;
    }
}

