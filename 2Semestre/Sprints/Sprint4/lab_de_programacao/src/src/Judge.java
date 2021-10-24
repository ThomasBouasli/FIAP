import java.util.ArrayList;

public class Judge{

    ArrayList<Team> teams;
    int fights = 0;

    public Judge(ArrayList<Team> teams){
        this.teams = teams;
    }

    public void play(){
        for(Team team : teams){
            for (Team otherTeam : teams) {
                if(team != otherTeam){
                    team.fight(otherTeam);
                }
            }
        }
        Team[] sortedTeams = sortTeams();
        for(int i = 0; i < sortedTeams.length; i++){
            sortedTeams[i].print();
        }
    }

    //sort teams based on points

    public Team[] sortTeams(){

        boolean sorted = false;

        Team[] teamsArray = new Team[teams.size()];
        teams.toArray(teamsArray);

        while(!sorted){
            sorted = true;
            for (int i = 0; i < teamsArray.length - 1; i++) {
                if (teamsArray[i].points < teamsArray[i+1].points ){
                    Team temp = teamsArray[i];
                    teamsArray[i] = teamsArray[i+1];
                    teamsArray[i+1] = temp;
                    sorted = false;
                }else if(teamsArray[i].points == teamsArray[i+1].points){
                    if (teamsArray[i].pointsForDesign < teamsArray[i+1].pointsForDesign){
                        Team temp = teamsArray[i];
                        teamsArray[i] = teamsArray[i+1];
                        teamsArray[i+1] = temp;
                    }
                }
            }
        }

        return teamsArray;
    }

    public ArrayList<Team> getThreeBestTeams(){
        ArrayList<Team> threeBestTeams = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            threeBestTeams.add(teams.get(i));
        }
        return threeBestTeams;
    }

    public void resetTeams(){
        teams.forEach(team -> team.reset());
    }

    public Team getWinner(){
        Team[] sortedTeams = sortTeams();
        return sortedTeams[0];
    }
}