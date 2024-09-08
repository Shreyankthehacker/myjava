interface shape{
  double getArea();
  double getPerimeter();
}
class circle implements shape{
  private double radius;
  circle(double rad){
    radius = rad;
  }
  public double getArea(){
    return radius*radius*3.14159;
  }
  public double getPerimeter(){
   return 6.28*radius;
  }
}

class rectangle{
  private double length , width;
  rectangle(int length,int width){
    this.length = length;
    this.width = width;
  }

  public double getArea(){
    return length*width;
  }
  public double getPerimeter(){
    return 2*(length+width);
  }
}
public class InterfaceDemo{
  public static final void main(String args[]){
    circle c = new circle(2.34);
    System.out.println("Area of circle is " + c.getArea());
    System.out.println("Perimeter of circle is " + c.getPerimeter());
    rectangle r = new rectangle(2,3);
    System.out.println("Area of the rectangle is " + r.getArea());
    System.out.println("the perimeter of the rectangle is "+r.getPerimeter());

// using interface creates a constrait that all the classs implemeting the interface must create the class using all the mandatory functions defined inside the interace
  }
}