import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
     Scanner a=new Scanner(System.in);
     int row=a.nextInt();
     int column=a.nextInt();
     int i,j;
     int[][]arr=new int[row][column]; 

     for(i=0;i<row;i++){
     for(j=0;j<column;j++){
         arr[i][j]=a.nextInt();
     }
     }

     for(i=0;i<row;i++){
        int rowsum=0;
     for(j=0;j<column;j++){
     rowsum += arr[i][j];
     }
     System.out.println("Row "+(i+1)+" sum: "+rowsum);
     }

     for(j=0;j<column;j++){
        int sum=0;
        for(i=0;i<row;i++){
            sum+=arr[i][j];
        }
     System.out.println("Column "+(j+1)+" sum: "+sum);
     }

     int max=arr[0][0];
     for(i=0;i<row;i++){
     for(j=0;j<column;j++){
        if(arr[i][j] > max){
            max=arr[i][j];
            
        }
     }
     }
     System.out.println("\nMaximum element: "+max);
    for(j=0;j<column;j++){
     for(i=0;i<row;i++){
     System.out.print(arr[i][j] +" ");
     }
     System.out.println();
    }
    }
}
 
    
