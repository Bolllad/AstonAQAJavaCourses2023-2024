public class Lesson_10 {
    static public void main(String[] args) {
        Box boxOfOranges1 = new Box();
        boxOfOranges1.addFruit(new Orange());
        boxOfOranges1.addFruit(new Orange());

        Box boxOfApples1 = new Box();
        boxOfApples1.addFruit(new Apple());
        boxOfApples1.addFruit(new Apple());

        System.out.println("Box of oranges 1 weights: " + boxOfOranges1.getWeight());
        System.out.println("Box of apples 1 weights: " + boxOfApples1.getWeight());

        System.out.println("Does box of apples 1 weight as much as a box of oranges? - " + boxOfApples1.compare(boxOfOranges1));

        boxOfApples1.addFruit(new Orange());
        boxOfApples1.addFruit(new Apple());
        System.out.println("Does box of apples 1 weight as much as a box of oranges now? - " + boxOfApples1.compare(boxOfOranges1));

        Box boxOfApples2 = new Box();
        boxOfApples2.addFruit(new Apple());
        boxOfApples2.addFruit(new Apple());

        boxOfApples1.takeFruitsFrom(boxOfOranges1);
        boxOfApples1.takeFruitsFrom(boxOfApples2);

        System.out.println("Box of apples 1 weights: " + boxOfApples1.getWeight() + "\nBox of apples 2 weights: " + boxOfApples2.getWeight());
    }
}
