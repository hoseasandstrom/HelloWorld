import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by hoseasandstrom on 6/8/16.
 */
public class Exercise04 {

    static HashMap<String, String> nameMap = new HashMap<>();

    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Jones", "Charlie", "Brown"};
        //{"Smith": "Alice".....
        //HashMap<String, String>
        //subList

        //addUsers();
        // }

        //static void addUsers() {
        //names.put("Smith", "Alice");
        // names.put("Jones", "Bob");
        // names.put("Brown", "Charlie");
        //System.out.println(names);
        //}
        //Solution (Possible)
        ArrayList<String> namesArr = new ArrayList<>(Arrays.asList(names));
        ArrayList<String> pair;
        while (namesArr.size() > 0) {
            pair = new ArrayList<>(namesArr.subList(0, 2));
            namesArr = new ArrayList<>(namesArr.subList(2, namesArr.size()));
            nameMap.put(pair.get(1), pair.get(0));
        }
        System.out.println(nameMap);
    }
}

