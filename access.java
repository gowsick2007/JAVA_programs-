
class OverloadingExample {

    // Public method - Accessible everywhere
    public void display() {
        System.out.println("Public method: No parameters");
    }

    // Protected method - Accessible in the same package and subclasses
    protected void display(int a) {
        System.out.println("Protected method: Integer parameter: " + a);
    }

    // Default method - Accessible only within the same package
    void display(String name, int age) {
        System.out.println("Default method: Name = " + name + ", Age = " + age);
    }

    // Private method - Accessible only within this class
    private void display(int a, int b, int c) {
        System.out.println("Private method: Sum = " + (a + b + c));
    }

    // Public method to call the private method inside the class
    public void callPrivateMethod() {
        display(10, 20, 30);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        obj.display(); // Calls public method
        obj.display(5); // Calls protected method
        obj.display("Alice", 25); // Calls default method
        obj.callPrivateMethod(); // Calls private method indirectly
    }
}

