
import com.sun.jdi.DoubleValue;
import java.util.*;
class Students{
  public int age ;
  public String name;
}
public class IntroToGenerics {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("hey");
    list.add("hello");
    for(String s : list)System.out.println(s);
    List<Integer> matrix1 = new ArrayList<Integer>(Arrays.asList(2,3,4));
    List<Integer>matrix2 = new ArrayList<Integer> (Arrays.asList(2,4,5));
    System.out.println(matrixMultiplication(matrix1,matrix2));
    Students arr[] = new Students[2];
    arr[0] = new Students();
    arr[0].age = 20;
    arr[0].name = "Shreyank";
    arr[1] = new Students();
    arr[1].age = 20;
    arr[1].name = "Cherrilyne";

List<Students> studentlist = convert(arr);// These arguments work fine for varargs method of defining the parameter but dont use 
for(Students s : studentlist){
  System.out.println(s.name + " is of the age "+s.age);
}

  List<Integer> ints = new ArrayList<>(Arrays.asList(2,3,4));
  // List<Integer> ints = nums;  not possible to convert number to integer or other way
  // ints.add(3.14);
   System.out.println(ints.toString().equals("[2,3,4,3.14,2]"));

// List<Integer> is not a subtype of List<Number> but integer is a subtype of number hence in array its possible but not in list
List<Number> nums = new ArrayList<>(Arrays.asList(2,3,4,5,6,9.8));
nums.addAll(ints);// this is possible bcz of "?" wildcard that is if the Integer is subtype of Number then it allows 

List< ? extends Number> newNums= ints;  // if the rhs type is a subtype or is a child of the xyz class then it allos to convert 

List<? extends Number> nums2 = nums;

// nums2.addAll(ints); we can use the extends wildcard method just to use list not to modify the list
List<? super Integer> nums3 = ints;
ints.add(3);
// use super wildcard to modify the data but 



//Collections.copy(newNums,ints);
Collections.copy(nums,ints);
// This is possible bcz the type of nums is List<number> which is a super class of integer but in right before line
//List<? extends Number> which isnt a superclass or anything for lIst<integer> so yeah

  }
// Matrix multiplication to demonstrate how the Integer doesnt need to be unboxed for using 
  static int  matrixMultiplication(List<Integer>u , List<Integer>v) 
  {
     if(u.size()!=v.size()){
      throw new IllegalArgumentException("Different size of matrix cant compute dot product");
     }

    int res = 0;
    for(int i = 0;i<v.size();i++){
      res += (u.get(i)*v.get(i));
    }
    return res;
  }

// Function to convert array to a generic type list

static <T> List<T> convert(T[] arr){ // static type of function with return type List of T class be it any and convert is the function name and the parameter be array of the type of the object it is storing
   List<T> list = new ArrayList<>(); // creating a list of T type to store and return 
   for(T i : arr){ // T type iterator for for each loop
    list.add(i); // adding it to the list
   }  
   return list;
   // can use varargs T...arr or array type of T[] arr but if array type used then shud box and send argumnet hence use varargs
}

public static <T> void copy(List<? super T> destination , List<? extends T>source ){
for(int i = 0;i<source.size();i++){
  destination.add(source.get(i));
}
}
// Normally use extends when u get or fetch the values from the structure and super when u want to put or fill the value into the structure

public static void cnt(Collection<? super Object>nums,int n){
  for(int i = 0;i<n;i+=2){
    nums.add(i);
  }
  // cnt can allow all the members who are child of the class object 
}
public static double sums(Collection<? extends Number>nums,int n){
  double sum = 0;
  for(Number nt : nums){
    sum += nt.doubleValue();

  }
  return sum;
}
// sums can allow all the members that are super class of the class Number but the children of number cant access this

}

