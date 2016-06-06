import sun.rmi.rmic.Names;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.jar.Attributes;
import java.util.stream.Collectors;

/**
 * Created by hoseasandstrom on 6/6/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"Alice", "bob", "charlie", "Andrew", "edward"};

        // ArrayList<Strings> that contains the names with only capital letters
        // filter out names that don't start with "A"
        // {"Alice", "Andrew"}
        ArrayList<String> newNames = new ArrayList<>();
        for (String name: names) {
            newNames.add(name.toUpperCase());
        }
        //Solution 1: modify index after removing
        for (int i = 0; i <newNames.size(); i++) {
            String name = newNames.get(i);
            if (!name.startsWith("A")) {
                newNames.remove(i);
                i--;
            }
        }
        ArrayList<String> tempNames = new ArrayList<>();
        for (String name : newNames) {
            if (name.startsWith("A"));
            tempNames.add(name);
        }
        System.out.println(tempNames);
        //Solution 3
        newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name.toUpperCase());
            }
        Iterator<String> iter = newNames.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }
        System.out.println(newNames);

        //Solution 4: use stream
        newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name);
        }
        newNames = newNames.stream() //parallelStream() if there is a ton of data in the ArrayList
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new)); //returns ArrayList
        System.out.println(newNames);
    }
}
