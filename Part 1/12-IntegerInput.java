
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");

        //converts user's input to a number 
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + number1);

    }
}