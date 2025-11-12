

class library{
  String book="science";
  class Book{
    String book1="maths";
    void display(){
    System.out.println("inner class:"+book1);
    System.out.println("outer class:"+book);

    }
  }
}
public class nonstaticclass {
    public static void main(String[]args){
   library l=new library();
   library.Book b=l.new Book();
   b.display();
    }
    
}
