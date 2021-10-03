import java.util.Arrays;
import java.util.Scanner;

public class ElectronicJudge {

    private static Team[] teams;
    private static final Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

//        getTeams();
//        sortTeams();

        test_sort_algorithm();
    }


    public static void getTeams(){
        int number_of_teams = getNumberOfTeams();

        teams = new Team[number_of_teams];
        for (int i = 0; i < teams.length; i++) {
            String team_name = getTeamName();
            keyboard.nextLine();
            int grade = getTeamGrade();
            String[] matches_results = getTeamMatchesResults();
            teams[i] = new Team(team_name, grade,matches_results);
        }
    }

    public static void sortTeams(){

        boolean sorted = false;

        while(!sorted){
            sorted = true;
            for (int i = 0; i < teams.length - 1; i++) {
                if (teams[i].score < teams[i+1].score ){
                    Team temp = teams[i];
                    teams[i] = teams[i+1];
                    teams[i+1] = temp;
                    sorted = false;
                }else if(teams[i].score == teams[i+1].score){
                    if (teams[i].grade < teams[i+1].grade){
                        Team temp = teams[i];
                        teams[i] = teams[i+1];
                        teams[i+1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i].name + " | pontos: " + teams[i].score + " | partidas: " + Arrays.toString(teams[i].matchesResults) + " | notas: " + teams[i].grade );
        }

    }

    private static String getTeamName() {
        System.out.println("Insira o nome do time:");
        keyboard.reset();
        return keyboard.next();
    }


    private static int getTeamGrade() {
        System.out.println("Insira a nota do time:");
        return Integer.parseInt(keyboard.nextLine());
    }

    private static int getNumberOfTeams() {
        System.out.println("Insira a quantidade de times participantes:");
        return Integer.parseInt(keyboard.nextLine());
    }

    private static String[] getTeamMatchesResults() {
        System.out.println("Insira a quantidade de partidas que o time participou:");
        int matches = Integer.parseInt(keyboard.nextLine());
        String[] matchesResults = new String[matches];

        for (int i = 0; i < matchesResults.length; i++) {
            System.out.println("Insira o resultado da partida " + i + " :");
            matchesResults[i] = keyboard.nextLine();
        }

        return matchesResults;
    }

    private static void test_sort_algorithm(){

        teams = new Team[5];

        teams[0] = new Team("time 1", 8, new String[]{"V","V","D","D","D"});
        teams[1] = new Team("time 2", 10, new String[]{"D", "V", "V"});
        teams[2] = new Team("time 3", 2, new String[]{"D", "V"});
        teams[3] = new Team("time 4", 5, new String[]{"V", "V", "E"});
        teams[4] = new Team("time 5", 7, new String[]{"E", "V", "D"});

        sortTeams();
    }

}
