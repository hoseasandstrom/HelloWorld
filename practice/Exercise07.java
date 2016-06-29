import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by hoseasandstrom on 6/28/16.
 */
public class Exercise07 {

    public static void main(String[] args) {
        //date range: 01/01/2016 to 12/31/2016
        //get rid of slashes
        //MDDYY 61016 06/10/2016
        //how to loop dates - LocalDate API

        String s = "racecar";
        String h = "hello";

    }

    public static boolean isPalindrome(String input) {
        //return false;
        int n = input.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                return false;
            }
            return true;
        }

        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        ;
    }

}
