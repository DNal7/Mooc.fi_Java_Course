import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Asks user for year and stores input
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        // Checks if year is smaller than 2015, if true prints statement
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
