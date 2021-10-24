import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EngineFactory {

    private Random random = new Random();
    private int[][] months = new int[6][3];

    public EngineFactory() {
        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i].length; j++) {
                months[i][j] = random.nextInt(250);
            }
        }
    }

    public void show(){
        printMatrix(months);
    }

    public void show(String engine){

        int pointer = 0;

        switch (engine){
            case "M1":
                pointer = 0;
                break;

            case "M2":
                pointer = 1;
                break;

            case "M3":
                pointer = 2;
                break;
        }

        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i][pointer] + " ");
        }
        System.out.println();
    }

    public void getPrice(){
        int sum = 0;
        int price = 10;

        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[0].length; j++) {
                sum += months[i][j] * price + j*5; // j=0 -> 10 j=1 -> 15   j=2 -> 20
            }
        }

        System.out.println(sum);
        System.out.println();
    }


    public void getPrice(String engine){

        int pointer = 0;
        int price = 0;

        switch (engine){
            case "M1":
                pointer = 0;
                price = 10;
                break;

            case "M2":
                pointer = 1;
                price = 15;
                break;

            case "M3":
                pointer = 2;
                price = 20;
                break;
        }

        int sum = 0;

        for (int i = 0; i < months.length; i++) {
            sum += months[i][pointer] * price;
        }

        System.out.println(sum);
        System.out.println();

    }



    private void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
