import java.util.*;
class Leap {
    public static void main(String[] args){
      Scanner a = new Scanner(System.in);
      System.out.print("enter year:");
      int year = a.nextInt();
      if((year%4 ==0 && year%100!=0) || (year%400==0)){
        System.out.print(year + "is leap year");
      }else{
        System.out.print(year + "is not leap year");
      }
    }
    
}
