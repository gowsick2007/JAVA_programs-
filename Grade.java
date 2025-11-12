import java.util.Scanner;

 class Grade {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("enter student mark :");
        int mark = a.nextInt();

    
        if (mark >= 90 && mark <= 100) {
            System.out.println(" grade A");
        }else if (mark >= 80 && mark<90){
            System.out.println("grade B");
        }else if (mark>= 70 && mark<80){
            System.out.println("grade c");
        }else if (mark >= 60  && mark<70){
            System.out.println("grade d");
        }else {
            System.out.println("fail");
        }

    
    }
}

