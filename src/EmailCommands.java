import java.util.Scanner;

/**
 * Created by ayuub on 09/12/2016.
 */
public class EmailCommands {

    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Would you like gmail or outlook");
        String type = reader.nextLine();
        System.out.println("Are you sending or receiving emails?");
        String action = reader.nextLine();
    }
}
