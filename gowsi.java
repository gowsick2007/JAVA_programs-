
class gowsi{
    public static void main(String[] args){
  String s="gowsick";
  int count =0;
  for(char ch : s.toCharArray()){
   if(ch == 'e' || ch =='E'){
count++;
   }
   
  }
  System.out.println(count);
    }
}
