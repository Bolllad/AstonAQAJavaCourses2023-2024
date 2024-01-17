package lesson_5_task_2;

public class Triangle extends Shape implements PerimeterArea{
    int perimeter;
    double area;

    public Triangle(int sideA, int sideB, int sideC, String borderColor, String fillColor) {
        super(borderColor, fillColor);
        perimeter = perimeter(sideA, sideB, sideC);
        area = area(sideA, Double.valueOf((sideA + sideB + sideC) / 2) );
    }

    @Override
    public String toString() {
        return perimeter + ", " + String.format("%.2f", area) + ", " + borderColor + ", " + fillColor;
    }
}