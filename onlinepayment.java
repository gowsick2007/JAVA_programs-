import java.util.*;
abstract class product{
    abstract  double calculatdiscound();
    abstract  void    display();
}
class electronics extends product{
    double price;
    String name;
    electronics(double price, String name){
        this.price=price;
        this. name=name;
    }
    double calculatdiscound(){
        return price-(price*0.10);
    }
    void display(){
System.out.println("name:"+name);
System.out.println("price:"+price);
System.out.println("discount:"+calculatdiscound());
    }
}
class clothings extends product{
    double price;
    String name;
    clothings(double price, String name){
        this.price=price;
        this.name=name;
    }
    double calculatdiscound(){
        return price-(price*0.05);
    }
    void display(){
System.out.println("name:"+name);
System.out.println("price:"+price);
System.out.println("discount:"+calculatdiscound());
    }
}

public class onlinepayment {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("enter name:");
        String cname=a.nextLine();
        double cprice=a.nextDouble();
        String ename=a.nextLine();
        double eprice=a.nextDouble();

        clothings c=new clothings(cprice,cname);
        electronics e=new electronics(eprice, ename);
      c.display();
      e.display();
    }
}
