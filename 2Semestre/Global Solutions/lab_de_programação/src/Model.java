import java.util.ArrayList;

public class Model {
    private static ArrayList<String[]> Database = new ArrayList<String[]>();


    public static void addAnimal(String[] animal) {
        Database.add(animal);
    }

    public static ArrayList<String[]> getDatabase() {
        return Database;
    }
    
    public static String[] getAnimalByCode(String code) throws Exception {
        
        String[] match = null;

        for (String[] animal : Database) {
            if (animal[0].equals(code)) {
                match = animal;
                break;
            }
        }

        if (match == null) {
            throw new IllegalArgumentException("Nenhum animal com esse código!");
        }
        return match;
    }
}
