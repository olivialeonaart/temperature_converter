// import scanner
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            //initialize scanner
            Scanner scanner  = new Scanner(System.in);

            //display welcome message and options
            System.out.println("Welcome to the Temperature Converter");
            System.out.println("Choose Convertion Option 1 or Option 2:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");

            //get user input
            int choice = scanner.nextInt();

            //get temperature input to convert
            System.out.println("Enter the temperature to convert:");
            double temperature = scanner.nextDouble();

            //convert temperature based on user choice
            double convertedTemperature;
            if (choice == 1) {
                convertedTemperature = (temperature - 32) / 1.8;
                System.out.println("The converted temperature is: " + convertedTemperature + "°C");
            }
            else if (choice == 2) {
                convertedTemperature = (temperature * 1.8) + 32;
                System.out.println("The converted temperature is: " + convertedTemperature + "°F");
            }
            else {
                System.out.println("Invalid choice. Please select either 1 or 2.");
            }

        }

        //close scanner
        //end of main method
        //end of main class
        //end of program

    }

