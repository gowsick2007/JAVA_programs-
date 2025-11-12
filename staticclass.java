
class univercity{
    String collage="rathinam";
    static class department{
        String depart="AI&DS";
        void display(){
 System.out.println("department:"+depart);
  
        }
    }
} 
public class staticclass {
    public static void main(String[] args) {
       univercity.department obj=new univercity.department();//static class
       obj.display();
       univercity u =new univercity();//non static
       System.out.println("collage:"+u.collage);
    }
    
}
