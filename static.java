class StaticStudent {
    static void display(String name, int rollNumber, String course) {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class static {
    public static void main(String[] args) {
        StaticStudent.display("Rahul", 101, "Computer Science");
        StaticStudent.display("Priya", 102, "Electronics");
    }
}
