public class Main {

    private static MatrixHandler matrix = new MatrixHandler(4,4);
    private static EngineFactory factory = new EngineFactory();


    public static void main(String[] args) {

        System.out.println("Matrix Exercise");
        System.out.println();

        matrix.show();
        System.out.println();
        matrix.showEvenNumbersFromFirstDiagonal();
        System.out.println();
        matrix.showGreatestNumbersFromSecondDiagonal();
        System.out.println();

        System.out.println();
        System.out.println("Engine Factory Exercise");
        System.out.println();

        System.out.println("Matrix:");
        factory.show();
        System.out.println();
        System.out.println("M1 Engine");
        factory.show("M1");
        System.out.println();
        System.out.println("M1 Engine Prices");
        factory.getPrice("M1");
        System.out.println();
        System.out.println("Total Prices");
        factory.getPrice();

    }
}
