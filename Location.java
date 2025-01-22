import java.util.Scanner;

public class Location {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns (Ex: 2 3): ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        CreateArray array = new CreateArray(rows, columns);
        array.fillArray(rows, columns);
        array.printArray();
        input.close();
        System.out.println("The maximum value in the array is: "+ array.locateLargest());
    }
}

public class CreateArray extends Object {
    private final double[][] array;
    private final  int rowsOfArray;
    private final int columnsOfArray;
    //Constructor for making the array
    public CreateArray(int rows, int columns){
        this.array = new double[rows][columns];
        this.rowsOfArray = rows;
        this.columnsOfArray = columns;
    }
    //Makes the array with random numbers with number of rows and columns that user decides
    public void fillArray(int rowsOfArray, int columnsOfArray){
        for (int i = 0; i < rowsOfArray; i++){
            for (int j = 0; j < columnsOfArray; j++){
                array[i][j] = (double) (Math.random() * 100);
            }     
        }
    }
    //Method to print the created array
    public void printArray(){
        for (int i = 0; i < rowsOfArray; i++) {
            for (int j = 0; j < columnsOfArray; j++){
                System.out.print(array[i][j] + " ");
            } 
            System.out.println();      
        }
    }
    //Find the maxium value in the array   
    public double locateLargest(){
        double maxValue =  array[0][0];
        for (int i = 0; i < rowsOfArray; i++) {
            for (int j = 0; j < columnsOfArray; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j]; 
                }
            }
        }
        return maxValue;
    }
    public int[] positionOfNum ( double theNumber){
        int[] cell = new int[2];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if(array[i][j] == theNumber){
                    cell[0] = i;
                    cell[2] = j;
                    return cell;
                }
            }
        }
        return null;   
    }
}
