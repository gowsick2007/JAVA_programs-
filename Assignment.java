import java.util.Scanner;

class Assignment {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = a.nextInt();
    
        System.out.print("Enter second number: ");
        int num2 = a.nextInt();
        
        num1+=num2;
        System.out.println("num1+=num2=" + num1);

        num1-=num2;
        System.out.println("num1-=num2=" + num1);

        num1/=num2;
        System.out.println("num1/=num2=" + num1);
        
        num1 %= num2;
        System.out.println("num1%=num2=" + num1);

    }}
    

