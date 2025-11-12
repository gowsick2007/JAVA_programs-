import java.util.*;

    class Logical {
        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            System.out.print("enter a number:");
            int num = a.nextInt();

    
            if(num%3==0 && num%5==0){
                System.out.print(num + "divisible by 3 and 5");
            }else{
                System.out.print(num + "is not divisible by 3 and 5");
            }

        }
    }
