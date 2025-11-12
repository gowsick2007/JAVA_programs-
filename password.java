import java.util.Scanner;
public class password
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.length() < 8) 
        {
            System.out.println("Weak");
            scanner.close();
            return;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray())
         {
            if (Character.isUpperCase(c))
             {
                hasUpperCase = true;
             } 
            else if (Character.isLowerCase(c)) 
            {
                hasLowerCase = true;
            } 
            else if (Character.isDigit(c)) 
            {
                hasDigit = true;
            } 
            else
            {
                //hasSpecialChar = true;
            }

             for (int i = 0; i < password.length(); i++) {
 char ch = password.charAt(i);
 if (ch == '@') {
hasSpecialChar = true;
}
               }
            
              }
        if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) 
        {

            System.out.println("Strong");
        } 
        else if ((hasUpperCase || hasLowerCase) && hasDigit) 
        {
            System.out.println("Moderate");
        } 
        else
         {
            System.out.println("Weak");
         }

        scanner.close();
    }
}