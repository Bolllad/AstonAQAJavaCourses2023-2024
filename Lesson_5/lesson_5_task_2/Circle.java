package lesson_5_task_2;

public class Circle extends Shape implements PerimeterArea{
    double perimeter;
    double area;

    public Circle(int radius, String borderColor, String fillColor) {
        super(borderColor, fillColor);
        perimeter = perimeter(radius);
        area = area(radius);
    }

    @Override
    public String toString() {
        return String.format("%.2f", perimeter) + ", " + String.format("%.2f", area) + ", " + borderColor + ", " + fillColor;
    }
}
