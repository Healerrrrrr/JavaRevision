import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    public class MySweetProgram {

        public static void main(String[] args) throws FileNotFoundException {

            Scanner in = new Scanner(new File("Family.txt"));

            List<String> family = new ArrayList<String>();

            while(in.hasNextLine()){
                family.add(in.nextLine());
            }

            for(int i =0; i<family.size(); i++){
                System.out.println("name: " + family.get(i));
            }

            in.close();


        }
    }

