interface Color {
    void applyColor();
}

class Red implements Color {
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}

class Blue implements Color {
    public void applyColor() {
        System.out.println("Applying Blue Color");
    }
}

abstract class Shape {
    protected Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

class Circle extends Shape {
    Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Circle filled with ");
        color.applyColor();
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        redCircle.draw();
    }
}