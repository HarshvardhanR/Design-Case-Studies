package Flyweight;

public class Main {
    private static final String[] colors = {"Red", "Green", "Blue", "Red", "Green"};

    public static void main(String[] args) {
        for (int i = 0; i < colors.length; i++) {
            Shape circle = ShapeFactory.getCircle(colors[i]);
            int x = i * 10;
            int y = i * 5;
            circle.draw(x, y);
        }
    }
}

