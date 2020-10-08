import java.util.ArrayList;
import java.util.List;

public class RevisionProgram {

public static void main(String[] args) {

Person yacer = new Person();
yacer.setLastname("yacer");
yacer.setFirstname("saoud");

Person islam = new Person();
islam.setLastname("islam");
islam.setFirstname("saoud");

List <Person> people = new ArrayList<Person>();
people.add(yacer);
people.add(islam);

System.out.println(Person.searchList(people, "saoud", "islam"));


}
}
