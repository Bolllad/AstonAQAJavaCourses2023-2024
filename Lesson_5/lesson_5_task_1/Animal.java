package lesson_5_task_1;

public class Animal {
    private final int maxRunningDistance;
    private final int maxSwimmingDistance;
    protected String name;

    public Animal (String name, int maxRunningDistance, int maxSwimmingDistance) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxSwimmingDistance = maxSwimmingDistance;
    }

    public void run(int distance) {
        if (distance < maxRunningDistance && distance > 0) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м, т.к. максимальная дистанция бега " + maxRunningDistance + " м");
        }
    }

    public void swim(int distance) {
        if (distance < maxSwimmingDistance && distance > 0) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м, т.к. максимальная дистанция плавания " + maxSwimmingDistance + " м");
        }
    }
}
