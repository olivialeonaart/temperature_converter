
//import scanner
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            //initialize scanner
            Scanner scanner = new Scanner(System.in);

            //display welcome message and options
            System.out.println("Welcome to your Simple calculator,");
            System.out.println("You will be given 3 prompts for first number, second number, and operation type");
            System.out.println("Please enter numbers  in numerical format (ex 2, 1.5, 200) without commas or letters");

            //get user input for the first number
            System.out.println("Please enter the first number: ");

            int num1 = scanner.nextInt();

            //get user input for the second number
            System.out.println("Please enter the second number: ");

            int num2 = scanner.nextInt();

            //get user input for the operation type
            System.out.println("Please enter the number corresponding to your desired operation type: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            int operation = scanner.nextInt();




        }
    }
