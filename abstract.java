abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}
 class Main {
    public static void main(String[] args) {
        Circle s1 = new Circle();
        s1.draw();
        s1.display();

        Shape s2 = new Square();
        s2.draw();
        s2.display();
    }
}

