import java.util.*;
class Week{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter the day of number :");
        int day = a.nextInt();
        switch (day) {
            case 1:
                System.out.println("sunday");
                break;
                case 2:System.out.print("monday");break;
                case 3:System.out.print("tuesday");break;
                case 4:System.out.print("wednesday");break;
                case 5:System.out.print("thusday");break;
                case 6:System.out.print("friday");break;
                case 7:System.out.print("saterday");break;
            default:
                System.out.print("invalid");
        }
    }}
