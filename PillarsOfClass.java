class demo{
  void print(){
    System.out.println("Class field A variable that is shared among all the instances of class that is a common variable for all objects");
    System.out.println("Instance field is a variable that is created differently for each object uniquely that is different copies are made each time a object is created ");
  }
  static int thisisaclassfield = 0;// ; 
  static void classmethod(){
    System.out.println("this is class method");
  }
  int thisisainstancefield = 0;
  void instancemethod(){
    System.out.println("this is instance method");
  }

}





public class PillarsOfClass {
  public static final void main(String args[]){
    demo d = new demo();
    demo.classmethod();
    d.instancemethod();
    d.classmethod();
    //demo.instancemethod(); this cant be done 
  }
}
