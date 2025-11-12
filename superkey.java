class Person {
    String name = "John";

    Person() {
        System.out.println("Person constructor called");
    }

    void showName() {
        System.out.println("Name from Person class: " + name);
    }
}

class Student extends Person {
    String name = "Alice";

    Student() {
        super();
        super.showName();
        System.out.println("Name from Student class: " + name);
        System.out.println("Accessing Person class name using super: " + super.name);
    }
}
public class superkey {
    public static void main(String[] args) {
    }
}


