class machine{
     final void start(){
        System.err.println("this is final method");
    }
}
class washingmachine extends machine{
    
     }


public class finalmethod {
    public static void main(String[] args) {
        washingmachine w=new washingmachine();
        w.start();
    }
}
