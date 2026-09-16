package assignment2;

import java.util.Scanner;

class Team {
    protected String name;
    protected int matchesPlayed;
    protected int wins;
    protected int draws;

    // Constructor
    public Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    // Method to calculate points
    public int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {

    public CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    // Method overriding
    @Override
    public int calculatePoints() {
        return (wins * 2) + (draws * 1);
    }
}

class FootballTeam extends Team {

    public FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    // Method overriding
    @Override
    public int calculatePoints() {
        return (wins * 3) + (draws * 1);
    }
}

public class que7_sports {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cricket team
        String[] cricketData = sc.nextLine().split(",");

        String cricketName = cricketData[1].trim();
        int cricketMatches = Integer.parseInt(cricketData[2].trim());
        int cricketWins = Integer.parseInt(cricketData[3].trim());
        int cricketDraws = Integer.parseInt(cricketData[4].trim());

        // Football team
        String[] footballData = sc.nextLine().split(",");

        String footballName = footballData[1].trim();
        int footballMatches = Integer.parseInt(footballData[2].trim());
        int footballWins = Integer.parseInt(footballData[3].trim());
        int footballDraws = Integer.parseInt(footballData[4].trim());

        Team cricket = new CricketTeam(
                cricketName,
                cricketMatches,
                cricketWins,
                cricketDraws
        );

        Team football = new FootballTeam(
                footballName,
                footballMatches,
                footballWins,
                footballDraws
        );

        System.out.println("Team: " + cricket.name +
                " (Cricket) Points: " + cricket.calculatePoints());

        System.out.println("Team: " + football.name +
                " (Football) Points: " + football.calculatePoints());

        sc.close();
    }
}