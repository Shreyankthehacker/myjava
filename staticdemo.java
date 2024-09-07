class s{
  public static int x = 0;
  static void increment(){
    x++;
  }

}


public class staticdemo {
  public static void main(String args[]){
  s obj1 = new s();
  s obj2 = new s();
  obj1.increment();
  s.increment();
  System.out.println(s.x+" "+obj1.x+" "+obj2.x);
  System.err.println(s.x==obj1.x);
  }
}
