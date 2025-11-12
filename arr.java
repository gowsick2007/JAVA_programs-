
import java.util.*;
public class arr{
    public static void main(String[] args) {
      Scanner a=new Scanner(System.in);
      int num=a.nextInt();
      a.nextLine();
      double []arr=new double[num];
      int i;
      double sum=0;
      double avg;
      for(i=0;i<num;i++){
        arr[i]=a.nextDouble();
      }
      for(i=0;i<num;i++){
        sum=sum+arr[i];
      }
      avg=(double)sum/num;
      double high=arr[0];
      for(i=0;i<num;i++){
        if(arr[i]>high)
        high=arr[i];
      }
      double low=arr[0];
      for(i=0;i<num;i++){
        if(arr[i]<low)
        low=arr[i];
      }
      for(i=0;i<num;i++){
        if(arr[i]>avg)
        System.out.print(arr[i]+" ");
      }
      System.out.println("\nAverage Temperature: "+avg);
      System.out.println("Maximum Temperature: "+high);
      System.out.println("Minimum Temperature: "+low);
    }
}
