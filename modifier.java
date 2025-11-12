  class person{
        private String name;  // Private variable (accessible only in this class)
        public int age;       // Public variable (accessible from anywhere)
    
        // Setter method to assign a value to private variable
        public void setName(String name) {
            this.name = name;
        }
    
        // Getter method to retrieve private variable
        public String getName() {
            return name;
        }
    }
    
    public class modifier{
        public static void main(String[] args) {
            person p = new person();
            p.age = 25;  // Allowed (public)
            p.setName("Alice"); // Allowed (via public method)
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.age);
        }
    }
    

