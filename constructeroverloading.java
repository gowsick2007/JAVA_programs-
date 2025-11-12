class product{
    int id;
    String name;
    product(){
        System.err.println("hiii");
    }
    product(int id){
        System.err.println("id:"+id);
    }product(int id,String name){
        System.err.println(id+" "+name);
    }
}
public class constructeroverloading {
    public static void main(String[] args) {
        product p=new product();
        product p1=new product(2);
        product p2=new product(2,"gowsi");
    }
}
