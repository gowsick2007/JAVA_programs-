import java.util.*;
class maths{
    static class calculator{
        static int subtraction(int a,int b){
         return a-b;

        }
        static float division(float c,float d){
            return c/d;
        }
    }
}
public class nestedclass {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.err.print("enter num 1 for int:");
        int a=num.nextInt();
        System.err.print("enter num 2 fot int :");
        int b=num.nextInt();
        System.err.print("enter num 1 for float:");
        float c=num.nextInt();
        System.err.print("enter num 2 for float:");
        float d=num.nextInt();
        System.err.println("subtraction:"+maths.calculator.subtraction(a,b));
        System.err.println("division:"+maths.calculator.division(c,d));

    }
    
}
