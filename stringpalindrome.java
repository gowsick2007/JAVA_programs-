
    import java.util.*;
public class stringpalindrome {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String s=a.nextLine();
        int n=s.length();
        String r="";
        for(int i=n-1;i>=0;i--){
       r=r+s.charAt(i);
        }
        if(s.equals(r)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

