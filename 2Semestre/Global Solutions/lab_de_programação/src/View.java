public class View {
    
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

        Controller.mainMenuController();
    }

    public static void cadastrarMenu(){
        clearScreen();
        System.out.println("");
        System.out.println("1. Bovino");
        System.out.println("2. Suíno");
        System.out.println("3. Caprino");
        System.out.println("");

        try {
            Controller.cadastrarMenuController();
        } catch (Exception e) {
            print(e.getMessage());
            cadastrarMenu();
        }
    }


    //clear screen
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void print(String text){
        System.out.println(text);
    }
}
