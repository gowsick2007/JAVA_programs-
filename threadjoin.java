class threada extends Thread{
 public void run(){
    for(int i=1;i<=5;i++){
        System.out.println("therad A:"+i);

    try{
        Thread.sleep(500);
    }catch(Exception e){
       System.out.println(e);
    }
}
}
}
class threadb extends Thread{
    public void run(){
        for(char c='A';c<='E';c++ ){
    System.out.println("therad B:"+c);
    try {
        Thread.sleep(500);
    } catch (Exception e) {
        System.out.println(e);
    }
        }
     }
}
public class threadjoin {
    public static void main(String[] args) {
        threada th=new threada();
        threadb the=new threadb();
        try {
            th.join();
            the.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        th.start();
         the.start();
    }
}
