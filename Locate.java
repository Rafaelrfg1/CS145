
import java.util.Scanner;

class GenArr {

    private double[][] userArr;
    private int row;
    private int col;

    public double[][] getArr() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array:");
        String rc = input.nextLine();

        row = Integer.parseInt(rc.substring(0, 2));
        col = Integer.parseInt(rc.substring(3));

        userArr = new double[row][col];
        return userArr;
    }

    public double[][] popArr() {
        System.out.println("Enter the array with " + (row * col) + " numbers of varying size:");

    }
}

public class Locate {

    public static void main(String[] args) {

    }
}
