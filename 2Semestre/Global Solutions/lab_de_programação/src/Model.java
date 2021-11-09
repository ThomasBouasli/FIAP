import java.util.ArrayList;

public class Model {
    public static ArrayList<Animal> Database = new ArrayList<Animal>();


    public static void addAnimal(Animal animal) {
        Database.add(animal);
    }

    public static ArrayList<Animal> getDatabase() {
        return Database;
    }
    
    public static Animal getAnimalByCode(String code) throws Exception {
        
        Animal match = null;

        for (Animal animal : Database) {
            if (animal.decryptedCode.equals(code)) {
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
