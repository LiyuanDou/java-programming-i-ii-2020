
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int valueFirst = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int valueSecond = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int valueThird = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (valueFirst+valueSecond+valueThird));

    }
}