import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class random {
  public static void main(String[] args) {
    supplier();
}

  public void Int(){
    Predicate<Integer> iseven = n -> n%2==0; //Predicate<T> is the functional interface
  IntPredicate isodd = n-> n%2!=0; // Is the primitive specialization 
  System.out.println(isodd.test(89)); // Both of them has to be acessed using this function loalvariable.test
  System.out.println(iseven.test(78));
   }


   public static void consumer(){
     Consumer<String> s = str-> {
      
      str = str+str;
      System.out.println(str+" "+str.equals("HEyHEy"));
      
     };
     s.accept("HEy");


     IntConsumer newconsumer = i -> i*=23;
     newconsumer.accept(23);
   
   }



   public static  void functionTR(){
      Function<Integer,String>  inttostring= (Integer x)->{
        return String.valueOf(x);
      } ;
      System.out.println(inttostring.apply(5).getClass().getSimpleName());
      
   }

   public static void supplier(){
    Supplier<Integer> s = () ->{
      System.out.println(6);
      return 6;
    };
    s.get();
    
   }
  }
