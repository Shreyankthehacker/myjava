import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streams {
  public static void main(String[] args) {
    // Create a list and filter all even number
    List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,9,0,7,5,43,2,2));
    // Wihtout stream
    List<Integer> even = new ArrayList<>();
    for(Integer i : list){
      if(i%2==0){
        even.add(i);
      }
    }
    System.out.println(even);

    Stream<Integer> stream = list.stream();
    List<Integer> evens = stream.filter(i-> i%2==0)
    .collect(Collectors.toList());
    System.out.println(evens);

    System.out.println(list.stream().filter(i -> i%2==0).collect(Collectors.toList()));
    System.out.println(list.stream().filter(i -> i>5).collect(Collectors.toList()));
    String [] a = {"hey","hello"};
    Stream<String> str = Stream.of(a);
    Integer [] array = {1, 2, 3, 4, 5};
    Stream<Integer> s = Stream.of(array);
    s.forEach(e->{
      System.out.println(e);
    });
    int [] arr = {2,3,4,5};
    IntStream p = Arrays.stream(arr);
    System.out.println(   list.stream().filter(i->iseven(i)).map(i-> i*2).collect(Collectors.toList()));
    System.out.println(list.stream().sorted().map(i-> i*2).filter(i -> iseven(i)).collect(Collectors.toList()));
  }
  static boolean iseven(int a){
    return a%2==0;
  }
}
