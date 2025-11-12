import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class APPENDFILE {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        System.out.print("How many student names do you want to enter? ");
        int count = input.nextInt();
        input.nextLine();
     try{
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\GOWSICK\\Desktop\\students.txt",true));

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter name " + i + ": ");
            String name = input.nextLine();
            writer.write(name);
            writer.newLine();

        writer.close();
        
        }
    }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Student names saved to students.txt");
        input.close();
    }

}

