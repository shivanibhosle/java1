class Shape {
    // Base method to be overridden
    public double area() {
        return 0.0;
    }
}

// Subclass 1
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass 2
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

// Subclass 3
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Main execution class
public class mi {
    public static void main(String[] args) {
        // 1. Create an array of Shape references
        Shape[] shapes = new Shape[3];

        // 2. Store objects of all three subclasses in it
        shapes[0] = new Circle(5.0);          // Circle with radius 5
        shapes[1] = new Rectangle(4.0, 6.0);  // Rectangle with length 4, width 6
        shapes[2] = new Triangle(3.0, 8.0);   // Triangle with base 3, height 8

        // 3 & 4. Use a loop to call area() and display the calculated areas
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + " Area: " + shapes[i].area());
        }
    }
}

