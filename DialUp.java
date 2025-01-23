import java.util.Scanner;

public class DialUp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string:");

        String userString = input.nextLine();
        for (int i = 0; i < userString.length(); i++) {
            char ch = userString.charAt(i); // Converts string into chars
            getNumber(ch);
        }
    }

    // Method to convert uppercase letter into number
    static int getNumber(char ch) {
        int number = 0;
        switch (Character.toUpperCase(ch)) { // Convert to all uppercase
            case 'A', 'B', 'C' ->
                number = 2;
            case 'D', 'E', 'F' ->
                number = 3;
            case 'G', 'H', 'I' ->
                number = 4;
            case 'J', 'K', 'L' ->
                number = 5;
            case 'M', 'N', 'O' ->
                number = 6;
            case 'P', 'Q', 'R', 'S' ->
                number = 7;
            case 'T', 'U', 'V' ->
                number = 8;
            case 'W', 'X', 'Y', 'Z' ->
                number = 9;
            default -> {
                System.out.print(ch); // If char is not a letter or number, it will print to the console
            }
        }
        if (number != 0) {
            System.out.print(number);
        }
        return number;
    }
}
