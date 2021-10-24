import java.util.ArrayList;
import java.util.Scanner;


public class Main{

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        CLS();
        ArrayList<Team> preliminaryTeams = getInput();
        CLS();
        System.out.println("-----------  Semi Finals  -----------");
        System.out.println("");
        Judge semiFinalsJudge = new Judge(preliminaryTeams);
        semiFinalsJudge.play();
        semiFinalsJudge.resetTeams();
        System.out.println("-------------  Finals  --------------");
        System.out.println("");
        Judge finalsJudge = new Judge(semiFinalsJudge.getThreeBestTeams());
        finalsJudge.play();
        System.out.println("");
        System.out.println("Winner: " + finalsJudge.getWinner().name);
        finalsJudge.resetTeams();

    }


    private static ArrayList<Team> getInput() {
        System.out.println("Quantas equipes irão participar?");
        int teamLength = keyboard.nextInt();
        ArrayList<Team> teams = new ArrayList<Team>();
        for (int i = 0; i < teamLength; i++){
            System.out.println("Qual o nome da equipe " + (i+1) + "?");
            String teamName = keyboard.next();
            teams.add(new Team(teamName));
        }
        return teams;
    }


    private static void CLS() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

}
