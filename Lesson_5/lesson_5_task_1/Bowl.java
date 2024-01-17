package lesson_5_task_1;

public class Bowl {
    int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void fill(int amount) {
        foodAmount += amount;
    }
}
