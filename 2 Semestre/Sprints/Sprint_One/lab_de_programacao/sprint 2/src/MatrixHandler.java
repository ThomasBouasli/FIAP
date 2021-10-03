import java.util.ArrayList;
import java.util.Random;

public class MatrixHandler {

    private Random random = new Random();
    private int[][] values;


    public MatrixHandler(int x, int y) {
        this.values = new int[x][y];
        generateRandomValues();
    }

    public void show(){
        printMatrix(values);
    }

    public void showEvenNumbersFromFirstDiagonal(){
        System.out.println("Even Numbers From First Diagonal:");
        System.out.println(getEvenNumbersFromFirstDiagonal());
    }

    public void showGreatestNumbersFromSecondDiagonal(){
        System.out.println("Greatest Numbers From Second Diagonal:");
        System.out.println(getGreatestNumbersFromSecondDiagonal());
    }

    private void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private ArrayList<Integer> getEvenNumbersFromFirstDiagonal(){

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (int i = 0; i < values.length; i++) {
            if (values[i][i] % 2 == 0){
                evenNumbers.add(values[i][i]);
            }
        }

        return evenNumbers;
    }

    private int getGreatestNumbersFromSecondDiagonal(){

        int greatest = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = values[0].length - 1; j >= 0 ; j--) {
                if (values[i][j] > greatest){
                    greatest = values[i][j];
                }
            }
        }
        return  greatest;
    }

    private void generateRandomValues(){
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = random.nextInt(500);
            }
        }
    }
}
