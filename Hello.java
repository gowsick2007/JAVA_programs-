import java.util.*;
class Hello {
    public static void main (String[] args)
    {
         Scanner a = new Scanner(System.in);
        System.out.print("enter your name :");
        String name = a.nextLine();
        System.out.println("your name:" + name);
        
        a.nextLine();
      System.out.print("enter your initial:");
      char initial = a.next().charAt(0);
      System.out.println("your initial :" + initial);
        
        a.nextLine();
        System.out.print("enter the age:");
      int age = a.nextInt();
      System.out.println("your age:" +age);
      
      a.nextLine();
      System.out.print("enter your number :");
      long num = a.nextLong();
      System.out.println("your ph number :" + num);
      
      a.nextLine();
      System.out.print("enter your e mail:");
      String email = a.nextLine();
      System.out.println("your mail:" + email);
      
      a.nextLine();
      System.out.print("enter your blood :");
      String blood = a.nextLine();
      System.out.println("your  blood:" + blood);
      
      a.nextLine();
      System.out.print("enter your height:");
      float height = a.nextFloat();
      System.out.println("your height :" + height);
      
      
      
      a.nextLine();
      System.out.print("enter your address :");
      String address = a.nextLine();
      System.out.print("your address :" + address);
      
      
    
     
}

}
