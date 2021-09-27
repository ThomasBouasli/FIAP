public class Team {

    public String name;
    public int grade;
    public String[] matchesResults;
    public int score;

    public Team(String _name, int _grade, String[] _matchesResults) {

        name = _name;
        grade = _grade;
        matchesResults = _matchesResults;

        for (String result :
                _matchesResults) {
            switch (result) {
                case "V":
                    score += 5;
                    break;

                case "E":
                    score += 3;
                    break;

                case "D":
                    break;
            }
        }
    }
}
