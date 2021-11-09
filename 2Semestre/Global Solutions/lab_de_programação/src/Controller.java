import java.util.Scanner;

public class Controller {

    private static Scanner keyboard = new Scanner(System.in);


    public static void mainMenuController() {

        int choice = keyboard.nextInt();

        switch (choice) {
            case 1:
                cadastrar();
                break;
            case 2:
                relatorio();
                break;
            case 3:
                pesquisa();
                break;
            default:
                throw new IllegalArgumentException("Opção inválida.");
        }
    }

    public static void cadastrarMenuController(){
        
        int choice = keyboard.nextInt() - 1;
        String[] options = {"Bovino" , "Caprino" , "Suíno"};


        if (choice >= 0 && choice <= 3) {

            String race = options[choice];

            View.print("Insira a idade do animal: ");
            int age = keyboard.nextInt();
    
            View.print("Insira o peso do animal: ");
            double weight = keyboard.nextDouble();
    
            Model.addAnimal(createAnimal(race, age, weight));  
            mainMenu();
              
        } else {
            throw new IllegalArgumentException("Opção inválida.");
        }
    }

    public static void mainMenu(){
        View.mainMenu();
    }

    public static void cadastrar(){
        View.cadastrarMenu();
    }


    public static void pesquisa(){
        View.clearScreen();

        keyboard.nextLine();

        View.print("Insira o código do Animal:");
        String code = keyboard.nextLine();
        try {
            Animal animal = Model.getAnimalByCode(code);
            printAnimal(animal);
        }catch (Exception e){
            View.print(e.getMessage());
        }

        View.print("Pressione qualquer tecla para voltar ao menu principal.");
        keyboard.nextLine();
        keyboard.nextLine();
        mainMenu();
    }

    private static void printAnimal(Animal animal) {
        View.print("_______________________________________________________________________________");
        View.print("Código: " + animal.decryptedCode + " | " +"Código encriptado: " + animal.encryptedCode);
        View.print("Idade: " + animal.age + " | " + "Peso: " + animal.weight);
        View.print("_______________________________________________________________________________");
    }

    public static void relatorio(){
        View.clearScreen();
        for (Animal animal : Model.getDatabase()) {
            printAnimal(animal);
        }
        View.print("Pressione qualquer te1cla para voltar ao menu principal.");
        keyboard.nextLine();
        keyboard.nextLine();
        mainMenu();
    }
    

    public static Animal createAnimal(String race, int age, double weight){

        String codePrefix = race.substring(0,2).toUpperCase();
        String code = codePrefix + generateCode();
        String encryptedCode = encrypt(code, 3);
        return new Animal(encryptedCode, code, race, age, weight);
    }



    public static String encrypt(String plainText, int key) {
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (Character.isUpperCase(ch)) {
                cipherText += (char) (((ch + key - 65) % 26) + 65);
            } else if (Character.isLowerCase(ch)) {
                cipherText += (char) (((ch + key - 97) % 26) + 97);
            } else {
                cipherText += ch;
            }
        }
        return cipherText;
    }

    public static String generateCode() {
        String code = "";
        for (int i = 0; i < 3; i++) {
            code += (char) (65 + (int) (Math.random() * 26));
        }
        return code.toUpperCase();
    }
}
