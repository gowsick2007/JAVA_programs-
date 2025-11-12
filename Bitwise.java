import java.util.*;

class Bitwise {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = t.nextInt();
        System.out.println("enter a number:");
        int b = t.nextInt();
        int c;
        c = a & b;
        System.out.println("a&b= :" + c);
        c = a | b;
        System.out.println("a|b =:" + c);
        c = ~ a;
        System.out.println("~a = :" + c);
        c = a >> b;
        System.out.println("a>>b = :" + c);
        c= a << b;
        System.out.println("a<<b = :" + c);


    }
    
}
