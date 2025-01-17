import java.util.Scanner;

public class Location {

    public void setArr(double[][] userArr) {
        this.userArr = userArr;
    }
    public double[][] getArr() {
        return this.userArr;
    }
    public static void main(String[] args) {
        GenArr a = new GenArr();
        a.setArr(GenArr(popArr));
    }
}

class GenArr {
    Scanner input = new Scanner(System.in);
    private double[][] userArr;
    private int row;
    private int col;

    public double[][] Arr() {
        
        System.out.println("Enter the number of rows and columns in the array:");
        String rc = input.nextLine();
        
        row = Integer.parseInt(rc.substring(0, 2));
        col = Integer.parseInt(rc.substring(3));

        userArr = new double[row][col];
        return userArr;
    }
    public double[][] popArr(double[][] userArr) {
        System.out.println("Enter the array with " + (row * col) + " numbers of varying size:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                userArr[i][j] = input.nextDouble();
            }
        }
        return userArr;
    }
}
