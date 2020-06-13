import java.util.ArrayList;
import java.util.Arrays;

public class GameofCraps {
    public static void main(String[] args) {
        ArrayList<Craps> games = new ArrayList<>(); // Create arraylist of craps games
        // Index 0 is total number of wins.
        int[] wins = new int[22]; // Every other index represents the total number of rolls to win. Index 21 is rolls greater than 20.
        int[] losses = new int[22]; // Same as line 8, but represents losses rather than wins
        Arrays.fill(wins, 0); // Filling wins array with zeros
        Arrays.fill(losses, 0); // Filling losses array with zeros
        for (int i = 0; i < 1000000; i++) { // for loop that goes to one "million dollars" (games) - Dr Evil
            games.add(new Craps());
        }
        for (Craps c : games) {  // Enhanced for loop to create automatic iterator that starts at zero index and goes to end
            c.play();
            if (!c.getWin()) {
                wins[0]++;
                // if conditionals to see how many times game is won on first and next roll..
                if (c.getNumRolls() > 20) {
                    wins[21]++;    // Incrementing number of wins greater than 20
                } else {
                    wins[c.getNumRolls()]++; // Increment win associated with index
                }
            } else {
                losses[0]++;
                // if conditionals to see how many times game is lost on first and next roll..
                if (c.getNumRolls() > 20) {
                    losses[21]++;    // Incrementing number of losses greater than 20
                } else {
                    losses[c.getNumRolls()]++; // Increment loss associated with index
                }
            }
        }
        printResults(wins, "Wins");
        printResults(losses, "Losses");
    }

    public static void printResults(int[] arr, String type) {
        // Prints a record of number of wins and losses
        System.out.println("Record of " + arr[0] + " " + type);
        // Printing number of rolls
        for (int i = 1; i < arr.length - 1; i++) {
            System.out.println(i + " Number of rolls: " + arr[i]);
        }
        System.out.println("> 20 Number of rolls: " + arr[arr.length - 1]);
    }
}
