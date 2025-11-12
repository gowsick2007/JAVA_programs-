import java.util.*;
public class agevalid{
    public static void main(String[] args)
     {
        Scanner a = new Scanner(System.in);
        System.out.println("enter age:");
        int age=a.nextInt();
        try {
            if(age<18){
                throw new IllegalArgumentException("age must at least 18");
            }else{
                System.out.print("age "+age+" is vali");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}