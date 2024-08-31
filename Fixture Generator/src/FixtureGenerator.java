import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FixtureGenerator {

    private ArrayList<String> teams;

    public FixtureGenerator(ArrayList<String> teams) {
        this.teams = teams;

        if(teams.size() % 2 != 0){
            teams.add("Bay");
        }
    }

    public void generateFixture() {

        int numberOfRounds = (teams.size() - 1) * 2;
        int numberOfMatchesPerRound = teams.size() / 2;
        ArrayList<String> tempTeams = new ArrayList<>(teams);

        for (int round = 0; round < numberOfRounds; round++) {
            System.out.println("Round " + (round + 1));

            for (int match = 0; match < numberOfMatchesPerRound; match++) {

                int home = match;
                int away = tempTeams.size() - 1 -match;

                if (round < numberOfRounds / 2){
                    System.out.println(tempTeams.get(home) + " vs " + tempTeams.get(away));
                } else if (round > numberOfRounds / 2) {
                    System.out.println(tempTeams.get(away) + " vs " + tempTeams.get(home));
                }
            }

            Collections.rotate(tempTeams.subList(1, tempTeams.size()), 1);
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> teams = new ArrayList<>();
        System.out.println("How many teams will compete?");
        int teamNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the teams names:");
        for(int i = 0; i < teamNumber; i++) {
            teams.add(scanner.nextLine());
        }

        FixtureGenerator fixtureGenerator = new FixtureGenerator(teams);
        fixtureGenerator.generateFixture();
        scanner.close();
    }
}