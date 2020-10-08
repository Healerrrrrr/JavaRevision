import java.util.List;

public class Person {

  private String firstname;
  private String lastname;


  public String getFullname(){
        return getFirstname() + " " + getLastname();
    }

  public String output(){
      return "hi my name is " + firstname+ " " + lastname;
  }

  public String getFirstname(){
      return firstname;
  }

  public void setFirstname(String fn){
      firstname= fn;
  }


    public String getLastname(){
        return lastname;
    } 

    public void setLastname(String ln){
        lastname= ln;
    }

    public static void printPerson(List<Person> people){
       for(Person p: people){
    System.out.println(p.getFullname());
}
    }


    public static int searchList(List<Person> people, String fn, String ln){
      for(int i =0; i<people.size(); i++){
    if (people.get(i).getFullname().equals(fn + " " +ln)){
        return i;
    }

      }
        return -1;

    }

}