import java.io.File;
import java.io.IOException;
import java.util.*;
public class People {
    private ArrayList<Person> db = new ArrayList<>();

    public People(final String fileName)  throws IOException {
        final Scanner in = new Scanner(new File(fileName));
        while(in.hasNextLine()){
            db.add(new Person(in.nextLine()));
        }
        in.close();
    } // constructor
    public Person get(int ID){
        for ( Person i : db) {
            if (ID == i.id()){
                return i;
            }
        }
        return null;
    }

    /*@Override
    public String toString() {
        return
                Person.toString;
    } // toString()
    */


}
