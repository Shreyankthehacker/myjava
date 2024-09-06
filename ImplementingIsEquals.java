class Person{
  private String firstname,lastname,email;
  Person(String firstname,String lastname,String email){
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
  }
  String getFirstname(){
    return firstname;
  }
  String getLastname(){
    return lastname;
  }
  String getEmail(){
    return email;
  }

  @Override
  public boolean equals(Object object){
    if(object==null){
      return false;
    }
    if( object== this)// with the referencing point then {
    {
      return true;
    }
    if(object.getClass()!=getClass()){//getClass() gives current class
      return false;
    }
    final Person other = (Person)object;
    if(getFirstname()==null){
      if(other.firstname!=null){
        return false;
      }
    }
    else{
      if(other.firstname!=getFirstname()){
        return false;
      }
    }
    if(getEmail()==null){
      if(other.email!=null){
        return false;
      }
    }
    else{
      if(other.email!=getEmail()){
        return false;
      }
    }
    if(getLastname()==null){
      if(other.lastname!=null){
        return false;
      }
    }
    else{
      if(other.lastname!=getLastname()){
        return false;
      }
    }

 return true;
  }
  
}


public class ImplementingIsEquals{
  public static void main(String args[]){
    Person p = new Person("Cherryline","tungol","shreyankisiri@gmail.com");
    Person r = new Person("Cherryline","tungol","shreyankisiri@gmail.com");
    System.out.println(p.equals(r));
  }
}