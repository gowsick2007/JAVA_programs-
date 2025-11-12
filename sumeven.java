// 1. HelloWorld Class
public class HelloWorld {
    public static void main(String[] args) {
        if (args.length >= 2) {
            System.out.println(args[0] + " " + args[1]);
        } else {
            System.out.println("Please provide at least two arguments.");
        }
    }
}

// 2. Demo Class with Scanner
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        int[] a = new int[6];
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter 6 integers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = obj.nextInt();
        }
        
        System.out.println("Entered integers:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        obj.close(); // Close the Scanner object
    }
}

// 3. Sum of Array Elements
class SumArray {
    public static void main(String[] args) {
        int arr[] = {5, 6, 8, 6, 8};
        int sum = 0;
        
        System.out.println("Array elements:");
        for (int x : arr) {
            System.out.println(x);
            sum += x;
        }
        
        System.out.println("Sum of array elements: " + sum);
    }
}

// 4. Array Size Calculation
public class ArraySize {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Array size: " + myArray.length);
    }
}

// 5. Student Class with Display Method
class Student {
    String name;
    int rollNumber;
    String course;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class University {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.rollNumber = 101;
        s1.course = "Computer Science";

        Student s2 = new Student();
        s2.name = "Priya";
        s2.rollNumber = 102;
        s2.course = "Electronics";

        s1.display();
        s2.display();
    }
}

// 6. Student Class with Constructor (Without this)
class StudentNoThis {
    String name;
    int rollNumber;
    String course;

    StudentNoThis(String n, int r, String c) {
        name = n;
        rollNumber = r;
        course = c;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class UniversityNoThis {
    public static void main(String[] args) {
        StudentNoThis s1 = new StudentNoThis("Rahul", 101, "Computer Science");
        StudentNoThis s2 = new StudentNoThis("Priya", 102, "Electronics");

        s1.display();
        s2.display();
    }
}

// 7. Student Class with Constructor (Using this)
class StudentWithThis {
    String name;
    int rollNumber;
    String course;

    StudentWithThis(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("Course: " + this.course);
    }
}

public class UniversityWithThis {
    public static void main(String[] args) {
        StudentWithThis s1 = new StudentWithThis("Rahul", 101, "Computer Science");
        StudentWithThis s2 = new StudentWithThis("Priya", 102, "Electronics");

        s1.display();
        s2.display();
    }
}

// 8. University Class with Scanner
import java.util.Scanner;

class StudentScanner {
    String name;
    int rollNumber;
    String course;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class UniversityScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        StudentScanner[] students = new StudentScanner[numStudents];

        for (int i = 0; i < numStudents; i++) {
            students[i] = new StudentScanner();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            students[i].name = scanner.nextLine();
            System.out.print("Roll Number: ");
            students[i].rollNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Course: ");
            students[i].course = scanner.nextLine();
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            students[i].display();
            System.out.println();
        }

        scanner.close();
    }
}