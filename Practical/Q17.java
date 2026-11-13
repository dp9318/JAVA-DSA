interface Drawable {
    void draw();
}

abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape implements Drawable {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw() {
        System.out.println("Drawing Circle with radius " + radius);
    }
}

class Rectangle extends Shape implements Drawable {
    double length, width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    public void draw() {
        System.out.println("Drawing Rectangle of " + length + "x" + width);
    }
}

class Q17 {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6) };

        for (Shape s : shapes) {
            System.out.println("Shape: " + s.name);
            System.out.println("Area: " + s.area());
            System.out.println("Perimeter: " + s.perimeter());
            if (s instanceof Drawable) {
                ((Drawable) s).draw();
            }
            System.out.println();
        }
    }
}

