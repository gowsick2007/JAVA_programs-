import java.util.*;
abstract class shape{
    abstract double area();
}
class Circle extends shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
        return 3.14*radius*radius;
    }
}
class Rectangle extends shape{
    int length,breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double area(){
        return length*breadth;
    }
}

class main{
    public static void main(String[] args){


    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the length:");
    int length = scanner.nextInt();
     System.out.println("enter the breadth:");
    int breadth = scanner.nextInt();
     System.out.println("enter the radius:");
    double radius=scanner.nextDouble();
    shape circle = new Circle(radius);
    shape rectangle = new Rectangle(length,breadth);
    System.out.printf("area of the circle is %.5f\n",circle.area());
    System.out.printf("area of the rectangle is %.5f\n",rectangle.area());
}
}
