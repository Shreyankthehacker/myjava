
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Apple{
   
private  int weight ;
private  String color;
private  int id;
Apple(int id , int weight , String color){
  this.id  = id;
  this.color = color;
  this.weight = weight;

}
public  int getid()
{
  return id;
}
public  String getcolor(){
  return color;
}
public int getweight(){
  return weight;
}
public static   String filtering(Apple obj){
  int id = obj.getid();
  String color = obj.getcolor();
  int weight = obj.getweight();
  return "The Apple with id "+id+" is of the color "+color+" with a "+(weight>150 ? "heavy":"light")+" weight of "+weight;
}


public static void main(String[] args) {
  List<Apple> list = new ArrayList<Apple>();
  list.add(new Apple(1,323,"Red"));
  list.add(new Apple(2,123,"Green"));
  list.add(new Apple(3,230,"Red"));
  list.add(new Apple(4,243,"Green"));
  list.add(new Apple(5,250,"Red"));
  list.add(new Apple(6,134,"Green"));
  if(!a.getcolor().equals("Red")){    System.out.println( filtering(a));}
}
  
}


