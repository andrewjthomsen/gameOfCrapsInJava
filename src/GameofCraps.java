import java.util.ArrayList;

public class GameofCraps {
    public static void main(String[] args) {
        ArrayList<Craps> games = new ArrayList<>(); // Create arraylist of craps games
        int[] wins = new int[22]; // Index is number of rolls for a win. Index 21 is rolls greater than 20.
        for (int i = 0; i < 1000000; i++) { // for loop that goes to one "million dollars" (games) - Dr Evil
            games.add(new Craps());
        }
        for (Craps c : games) {  // Enhanced for loop to create automatic iterator that starts at zero index and goes to end
            c.play();
            // if conditionals to see how many times game is won on first and next roll..
            if ()
        }
    }
}
