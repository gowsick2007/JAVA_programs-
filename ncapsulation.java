class Student { 
    private String name; 
    private int rollNumber; 
    private double marks; 
 
    public String getName() { 
        return name;
     } 
    public void setName(String name) { 
        this.name = name; } 
 
    public int getRollNumber() { 
        return rollNumber;
    
    } 
    public void setRollNumber(int rollNumber) { 
        
        this.rollNumber = rollNumber;
    
     } 
 
    public double getMarks() {
        
         return marks; 
        } 
    public void setMarks(double marks) { 
        this.marks = marks;
     } 
 
    public void displayStudentDetails() { 
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + 
marks); 
    } 
} 
 
public class ncapsulation{ 
    public static void main(String[] args) { 
        Student s = new Student(); 
        s.setName("John"); 
        s.setRollNumber(101); 
        s.setMarks(85.5); 
        s.displayStudentDetails(); 
    } 
} 
