
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 0 ) {
                break;
            } else {
                count++;
                sum = sum + userInput;
            }
        }
        System.out.println("Number of numbers: "+count);
        System.out.println("Sum of the numbers: "+sum);
    }
}