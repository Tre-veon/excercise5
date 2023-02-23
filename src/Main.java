import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer.");
        double doubleNUm = input.promptDouble("Enter your double");
        String userString = input.promptString("Enter your string ");
        System.out.println("Your integer is " + aNumber);
        System.out.println("Your double number is "+doubleNUm);
        System.out.println("Your string is "+ userString);
    }
}
class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            }
        }
        return userInt;
    }

    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0;

        boolean isInt = false;
        while (!isInt) {
            try {
                userDouble = Double.parseDouble(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = scanner.nextLine();
            }
        }
        return userDouble;
    }
     public String promptString (String message) {
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();


        boolean isString = true;
        while(isString) {
            try {
                double userInt = Double.parseDouble(userInput);
                isString = false;
            }
            catch (NumberFormatException e) {


                break;

            }
            System.out.println("Enter a string: ");
            userInput = scanner.nextLine();
        }
        return userInput;
    }




}