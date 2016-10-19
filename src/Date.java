import static java.lang.System.*;

/**
 * Created by Lauri on 19.10.2016.
 */
public class Date {
    public static void main(String[] args) {
        String day = "Kolmapäev";
        int date = 19;
        String month = "Oktoober";
        int year = 2016;

        System.out.println("Ameerika formaat:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println("Euroopa formaat:");
        System.out.println(day + " " + date + " " + month + " "  + year);

    }
}
