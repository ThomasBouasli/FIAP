import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static Scanner keyboard = new Scanner(System.in);
    public static ArrayList<String> names;
    public static ArrayList<Double> salariesIn2020;
    public static ArrayList<Double> salariesIn2021;
    public static ArrayList<Double> salariesIncrease;


    public static void main(String[] args) throws Exception {
        getEmployeesInformation();
        printEmployeesInformation();
    }


    public static void getEmployeesInformation(){
        System.out.println("Insira o numero de funcionários: ");

        int numberOfEmployees = keyboard.nextInt();
        names = new ArrayList<String>();
        salariesIn2020 = new ArrayList<Double>();
        salariesIn2021 = new ArrayList<Double>();
        salariesIncrease = new ArrayList<Double>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Nome do funcionário " + i + ": ");
            String name = keyboard.next();
            System.out.println("Salário do funcionário em 2020: ");
            double salary2020 = keyboard.nextDouble();
            System.out.println("Salário do funcionário em 2021: ");
            double salary2021 = keyboard.nextDouble();
            double salaryIncreasePercentage = (salary2021 - salary2020) / salary2020;
            names.add(name);
            salariesIn2020.add(salary2020);
            salariesIn2021.add(salary2021);
            salariesIncrease.add(salaryIncreasePercentage);
            clearScreen();
        }
    }

    public static void printEmployeesInformation(){
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Nome: " + names.get(i) + "----------------------------");
            System.out.println("");
            System.out.println("Salário em 2020: " + Math.floor(salariesIn2020.get(i) * 100) / 100);
            System.out.println("Salário em 2021: " + Math.floor(salariesIn2021.get(i) * 100) / 100);
            System.out.println("Percentual de aumento: " + Math.floor(salariesIncrease.get(i) * 100) / 100 );
        }
        createWhiteSpace();
        sortEmployeesNamesBySalaryIncrease();
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sortEmployeesNamesBySalaryIncrease(){
        ArrayList<String> sortedNames = new ArrayList<String>();
        ArrayList<Double> sortedSalariesIncrease = new ArrayList<Double>();

        for (int i = 0; i < salariesIncrease.size(); i++) {
            double lowestSalaryIncrease = salariesIncrease.get(i);
            int lowestSalaryIncreaseIndex = i;
            for (int j = i + 1; j < salariesIncrease.size(); j++) {
                if (salariesIncrease.get(j) < lowestSalaryIncrease) {
                    lowestSalaryIncrease = salariesIncrease.get(j);
                    lowestSalaryIncreaseIndex = j;
                }
            }
            sortedNames.add(names.get(lowestSalaryIncreaseIndex));
            sortedSalariesIncrease.add(salariesIncrease.get(lowestSalaryIncreaseIndex));
            names.set(lowestSalaryIncreaseIndex, names.get(i));
            salariesIncrease.set(lowestSalaryIncreaseIndex, salariesIncrease.get(i));
        }


        Collections.reverse(sortedNames);
        Collections.reverse(sortedSalariesIncrease);

        System.out.println("O funcionário com maior aumento de salário é: " + sortedNames.get(0));
        System.out.println("O funcionário com o menor aumento de salário é: " + sortedNames.get(sortedNames.size() - 1));

        createWhiteSpace();

        System.out.println("Nomes ordenados por maior acrescimo do salário:");

        for (int i = 0; i < sortedNames.size(); i++) {
            System.out.println("Nome: " + sortedNames.get(i));
        }
    }


    public static void createWhiteSpace(){
        System.out.println("");
        System.out.println("");
        System.out.println("________________________________________");
        System.out.println("");
        System.out.println("");
    }
}
