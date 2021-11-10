import java.util.Scanner;

public class View {

    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        clearScreen();
        System.out.println("");
        System.out.println("1. Cadastrar");
        System.out.println("2. Relatório");
        System.out.println("3. Pesquisa");
        System.out.println("");

        int option = keyboard.nextInt();


        switch (option) {
            case 1:
                clearScreen();
                cadastrarMenu();
                break;
            case 2:
                clearScreen();
                showRelatorio();
                break;
            case 3:
                clearScreen();
                showPesquisar();
                break;
        }
                
    }

    public static void cadastrarMenu(){
        clearScreen();
        System.out.println("");
        System.out.println("1. Bovino");
        System.out.println("2. Suíno");
        System.out.println("3. Caprino");
        System.out.println("");

        int option = keyboard.nextInt();
        String[] choices = {"Bovino", "Suíno", "Caprino"};
        String race = choices[option - 1];

        System.out.println("Idade: ");
        int age = keyboard.nextInt();

        System.out.println("Peso: ");
        double weight = keyboard.nextDouble();


        try {
            Controller.createAnimal(race, age, weight);
            mainMenu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            returnToMenu();
        }
    }

    private static void showPesquisar() {
        System.out.println("Insira o código do animal: ");
        String codigo = keyboard.next();
        
        try {
            String[] result = Controller.getAnimalByCode(codigo);
            printAnimal(result);
            returnToMenu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            returnToMenu();
        }
    }

    private static void showRelatorio() {
        Controller.getAllDatabaseEntries().forEach(View::printAnimal);
        returnToMenu();
    }

    private static void returnToMenu() {
        System.out.println("");
        System.out.println("");
        System.out.println("Aperte qualquer tecla para voltar para o Menu...");
        keyboard.nextLine();
        keyboard.nextLine();
        mainMenu();
    }

    
    private static void printAnimal(String[] result) {
        System.out.println("_______________________________________________________________________________");
        System.out.println("Código: " + result[0] + " | " +"Código encriptado: " + result[1]);
        System.out.println("Idade: " + result[3] + " | " + "Peso: " + result[4]);
        System.out.println("_______________________________________________________________________________");
    }


    //clear screen
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
