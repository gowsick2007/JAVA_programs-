class father{
    void display(){
    System.out.print("father class");
    }
}
class child extends father{
     void display(){
    System.out.print("child class");
    }
}

public class inheritance {
    public static void main(String[] args) {
        
child c=new child();
c.display();
}
}