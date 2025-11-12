import java.util.*;
 
 class Relational {

   public static void main (String[] args){
   Scanner a = new Scanner(System.in);

System.out.print("Enter first number: ");
        int num1 = a.nextInt();
    
        System.out.println("Enter second number: ");
        int num2 = a.nextInt();

        if(num1==num2){
            System.out.println("numbers equal");
        }else if(num1>num2){
            System.out.println(num1 + "is greater then " + num2);
        }else{
           System.out.println(num2 + "is greater than" + num1);
        }

}
}
