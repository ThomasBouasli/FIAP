import java.util.ArrayList;

public class Team{
    public String name;
    public int wins;
    public int losses;
    public int ties;
    public int points = 0;
    public int pointsForDesign;
    public ArrayList<Team> foughtTeams;

    public Team(String name){
        this.name = name;
        foughtTeams = new ArrayList<Team>();
        generateDesignPoints();
    }

    public void addWin(){
        this.points += 5;
        this.wins++;
    }

    public void addLoss(){
        this.points += 0;
        this.losses++;
    }

    public void addTie(){
        points += 3;
        this.ties++;
    }

    public void generateDesignPoints(){
        this.pointsForDesign = (int)(Math.random() * 10);
    }

    public void fight(Team adversary){
        if(foughtTeams.contains(adversary)){
            return;
        }else{
            int me = (int) (Math.random() * 10);
            int them = (int) (Math.random() * 10);
    
            if(me > them){
                this.addWin();
                adversary.addLoss();
            }
            else if(me < them){
                this.addLoss();
                adversary.addWin();
            }
            else{
                this.addTie();
                adversary.addTie();
            }
            this.foughtTeams.add(adversary);
            adversary.foughtTeams.add(this);
        }
    }

    public void print(){
        System.out.println(this.name + "| Points: " + this.points + "| Wins: " + this.wins + "| Losses: " + this.losses + "| Ties: " + this.ties + "| Design: " + this.pointsForDesign);
    }

    public void reset(){
        this.points = 0;
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
        this.foughtTeams.clear();
    }
}