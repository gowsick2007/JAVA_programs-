public class sampleexception{

    void divide() throws Exception {
        int a = 10;
        int b = 0;
        int result = a / b; 
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        sampleexception obj = new sampleexception();

        try {
            obj.divide();
        } catch (Exception e) {
            System.out.println("Exception caught: Division by zero error");
        }
    }
}
 
    
