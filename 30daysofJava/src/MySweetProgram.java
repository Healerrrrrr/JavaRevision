import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;

public class MySweetProgram {

        public static void main(String[] args) {


            LinkedList<String> names = new LinkedList<String>();
            names.push("Yacer");
            names.push("Lamya");
            names.push("Hammadi");

            Iterator<String> it= names.iterator();
            names.add(2, "Jiji");

            for(String s: names){
                System.out.println(s);
            }

        


        }
    }

