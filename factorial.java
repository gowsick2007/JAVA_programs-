class factorial {
 int findFactorial(int number) {
 int fact = 1, i;
    for (i = 2; i <= number; i++) 
	fact *= i;
    return fact;
  }
public static void main(String[] args) {
factorial f=new factorial();
        int result = f.findFactorial(5);
    System.out.println("Factorial is : " + result);
}
}