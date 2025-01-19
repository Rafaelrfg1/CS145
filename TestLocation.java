
import java.util.Scanner;

class Location {

    int row;
    int column;
    double maxValue;

    // Constructor
    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    // Method to find the largest element in a 2D array
    public static Location locateLargest(double[][] array) {
        int maxRow = 0;
        int maxColumn = 0;
        double maxVal = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxVal) {
                    maxVal = array[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        return new Location(maxRow, maxColumn, maxVal);
    }
}

public class TestLocation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions from the user
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        double[][] array = new double[rows][cols];

        // Populate the array
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        // Find and display the largest element
        Location location = Location.locateLargest(array);
        System.out.println("The location of the largest element " + location.maxValue + " is at (" + location.row + ", " + location.column + ")");

    }
}
