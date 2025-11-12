class greetings{
    void message(){
        System.out.println("greetings class");
    }
}
public class anonymous {
    public static void main(String[] args){
      greetings g=new greetings(){
      void message(){
        System.out.println("Hello,user!");
      }
    };
    g.message();
    }
    
}

