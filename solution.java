import java.util.Scanner;

class solution{
    public static void main(String args[]){
         Scanner a=new Scanner(System.in);
         int n=a.nextInt();
         int sum=0,i;
int arr[]=new int[n];
     for(i=0;i<n;i++){
        arr[i]=a.nextInt();
   }
for(i=0;i<n;i++){
   sum+=arr[i]+arr[i+1];
    }
    if(sum==9){
        System.out.print("");
    }
}
}