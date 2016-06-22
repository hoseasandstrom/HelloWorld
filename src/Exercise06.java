/**
 * Created by hoseasandstrom on 6/22/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        Integer num = 12345, reverse = 0;


        while (num != 0) {
            reverse = reverse * 10;
            reverse = reverse + num%10;
            num = num/10;

        }
        System.out.println("12345 : " + reverse);
    }
}
