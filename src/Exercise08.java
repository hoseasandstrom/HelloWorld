import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by hoseasandstrom on 6/29/16.
 */
public class Exercise08 {
    static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        readPeopleFile();
        //Scanner consoleScanner = new Scanner(System.in);
        //System.out.println("Enter your search:");
        //String searchTerm = new consoleScanner.nextLine();


        //parse people .csv into ArrayList<String> that contain first and last names separated by a space
        //prompt the user for search term
        //print out the names that contain the term
     }
    public static void readPeopleFile () throws FileNotFoundException {
        File people = new File("people.csv");
        Scanner fileScanner = new Scanner(people);
        fileScanner.nextLine();
        while (fileScanner.hasNext()) {
            String[]columns = fileScanner.nextLine().split(",");
            String name = columns[1] + " " + columns[2];
            names.add(name);
        }

        String searchTerm = "";
        searchTerm = searchTerm.toLowerCase();

        //solve via for loop
        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm)) {
                System.out.println(name);
            }
        }
        System.out.println();

        //solve via streams
        String SearchTerm = searchTerm;
        names.stream()
                .map(name -> name.toLowerCase())
                .filter(name -> name.contains(SearchTerm.toLowerCase()))
                //.forEach(System.out::println)
                .collect(Collectors.toCollection(ArrayList<String>::new));

    }


}
