import java.util.ArrayList;

public class Box {
    private final ArrayList<Fruit> fruits = new ArrayList<>();

    public float getWeight() {
        float result = 0;
        for (Fruit fruit : fruits) {
            result += fruit.getWeight();
        }
        return result;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void takeFruitsFrom(Box box) {
        if (!(box.fruits.isEmpty()) && box.fruits.get(0).getWeight() == this.fruits.get(0).getWeight()) {
            this.fruits.addAll(box.fruits);
            box.fruits.clear();
        } else {
            System.out.println("Error: box shouldn't be empty and should contain same type of fruits!");
        }
    }

    public void addFruit(Fruit fruit) {
        if (this.fruits.isEmpty()) {
            fruits.add(fruit);
        } else if (this.fruits.get(0).getWeight() == fruit.getWeight()) {
            fruits.add(fruit);
        } else {
            System.out.println("Error: fruit type doesn't match!");
        }
    }
}
