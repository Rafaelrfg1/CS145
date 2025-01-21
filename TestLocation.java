
import java.util.Scanner;

class Location {

    private int row;
    private int column;
    private double maxValue;

    // Constructor
    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return this.row;
    }
    public int getColumn() {
        return this.column;
    }
    public double getMaxValue() {
        return this.maxValue;
    }
    
    // Method to find the largest element in a 2D array
    public static Location locateLargest(double[][] userArr) {
        int maxRow = 0;
        int maxColumn = 0;
        double maxVal = userArr[0][0];

        for (int i = 0; i < userArr.length; i++) {
            for (int j = 0; j < userArr[i].length; j++) {
                if (userArr[i][j] > maxVal) {
                    maxVal = userArr[i][j];
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
        Scanner input = new Scanner(System.in);

        // Get dimensions from the user
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] userArr = new double[rows][cols];

        // Populate the array
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                userArr[i][j] = input.nextDouble();
            }
        }

        // Find and display the largest element
        Location location = Location.locateLargest(userArr);
        System.out.println("The location of the largest element " + location.getMaxValue() + " is at (" + location.getRow() + ", " + location.getColumn() + ")");

    }
}
