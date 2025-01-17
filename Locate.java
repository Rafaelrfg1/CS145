import java.util.Scanner;

class GenArr {
    public static void main(String[] args) {
        GenArr a = new GenArr();
        a.getArr();
        a.popArr();
        a.Locate();
    }
    Scanner input = new Scanner(System.in);
    private double[][] userArr;
    private int row;
    private int col;

    public double[][] getArr() {
        
        System.out.println("Enter the number of rows and columns in the array:");
        String rc = input.nextLine();

        row = Integer.parseInt(rc.substring(0, 2));
        col = Integer.parseInt(rc.substring(3));

        userArr = new double[row][col];
        return userArr;
    }

    public double[][] popArr() {
        System.out.println("Enter the array with " + (row * col) + " numbers of varying size:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                userArr[i][j] = input.nextDouble();
            }
        return userArr;
}
class Locate {
    public static Locate locateLargest(double[][] userArr){
        double num = 0;
        for (int i = 0; i < userArr.length; i++) {
            for (int j = 0; j < userArr[i].length; j++) {
                if (userArr[i][j] > num) {
                    num = userArr[i][j];
                }
            }
        }
        double location = ArrayUtils.indexOf(userArr, num);
        System.out.println("The largest number is " + num + " and is located at " + location);
        return userArr;
    }
}
