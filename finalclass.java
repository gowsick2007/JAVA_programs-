final class mathconstants{
  final double pi=3.14;
  final void display(){
    System.err.println("pi value:"+pi);
  }
}
public class finalclass{
    public static void main(String[] args){
        mathconstants m=new mathconstants();
        m.display();
        
        
    }
}