
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0) {
                break;
            }

            count++;
            
            sum = sum + userInput;
        }
        double avg = 1.0*sum/count;
        System.out.println("Average of the numbers: " + avg);
    }
}
