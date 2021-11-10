import java.util.ArrayList;

public class Controller {


    public static String[] createAnimal(String race, int age, double weight){

        String codePrefix = race.substring(0,2).toUpperCase();
        String code = codePrefix + generateCode();
        String encryptedCode = encrypt(code, 3);

        String[] animal = {code, encryptedCode, race, Integer.toString(age), Double.toString(weight)};

        Model.addAnimal(animal);
        
        return animal; 
    }

    public static ArrayList<String[]> getAllDatabaseEntries(){
        return Model.getDatabase();
    }

    public static String[] getAnimalByCode(String codigo) throws Exception {
        return getAnimalByCodeFromDatabase(codigo);
    }

    private static String[] getAnimalByCodeFromDatabase(String code) throws Exception{
        return Model.getAnimalByCode(code);
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
