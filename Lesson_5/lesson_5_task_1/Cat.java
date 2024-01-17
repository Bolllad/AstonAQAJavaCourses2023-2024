package lesson_5_task_1;

public class Cat extends Animal{
    protected boolean full;

    public Cat(String name) {
        super(name, 200, 0);
        full = false;
    }

    public void eatFromBowl(Bowl bowl, int amount) {
        if (amount < bowl.foodAmount) {
            bowl.foodAmount -= amount;
            full = true;
        }
    }
}
