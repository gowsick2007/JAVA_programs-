 class employee{
    int salary=10000;
    void display(){
        System.out.println("salary:"+salary);
    }
}
    class manager extends employee{
        int bonus=1000;
        manager() {
    System.err.println("bonus:"+bonus);
    super.display();
    System.out.println("bonus from manager class: " + bonus);
      System.out.println("Accessing employee class salary using super: " + super.salary);
      
        }
       }

 class superkeyword {
    public static void main(String[] args){
        manager m=new manager();
        employee e=new employee();
        
    }
}
