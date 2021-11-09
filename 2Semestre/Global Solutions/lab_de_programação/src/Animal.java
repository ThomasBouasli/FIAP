public class Animal {

    public String encryptedCode;
    public String decryptedCode;
    public String race;
    public int age;
    public double weight;

    public Animal(String encryptedCode, String decryptedCode ,String race, int age, double weight){

        this.decryptedCode = decryptedCode;
        this.encryptedCode = encryptedCode;
        this.age = age;
        this.race = race;
        this.weight = weight;

    }

}
