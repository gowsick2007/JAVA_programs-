class math{
    void multiply(int a,int b){
     System.out.println("sum of two integer:"+(a+b));
    }
    void multiply(int a,int b,int c){
        System.out.println("sum of three integer:"+(a+b+c));
}
void multiply(double a,double b){
    System.out.println("sum of two double integer:"+(a+b));
}
}
public class methodoverloading {
    public static void main(String[] args) {
        math m=new math();
        m.multiply(2, 3);
        m.multiply(2, 3,4);
        m.multiply(2.34, 5.43);
    }
}
