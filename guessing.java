import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


class Dependent{
  private final DateFormat object;
  Dependent(final DateFormat thisformat){
    object = thisformat;
  }
  public String format ( final Date randomdate){
    return object.format(randomdate);
  }
  
}

public class guessing{
  public static void main(String args[]){
   DateFormat randomdate = new SimpleDateFormat("yyyy/mm/dd");
   Dependent depe = new Dependent(randomdate);
   System.out.println(depe.format( new Date()));
  }
}