package app;

public class Craps {
    
    

    /**
     * Modify the craps program in Fig 6.8 to allow wagering.
     * Start the user off with $1000.
     * Prompt the user to input a wager.
     * Make sure they have enough in their balance to cover their wager, re-prompt if not.
     * Run a game of Craps.
     * If the user wins, add the wager to their balance.
     * If the user loses, subtract the wager from their balance.
     * Show the user their new balance and ask for their next wager (use a sentinel value to quit).
     * If they hit zero, display a message "Sorry. You busted."
     * As they win or lose, use a separate method to randomly print different messages to egg on the user or encourage them to continue.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        

    }

    /**
     * Method to simulate the rolling of two dice
     * Returns the sum of those two dice faces
     * @return sum of two dice
     */
    public static int rollDice() {

    }

    /**
     * Create a dictionary of messages to randomly send the user
     * while they are playing to egg them on or encourage them
     * to continue playing.
     * 
     * Recommend using two String[] that are set with a number of messages.
     * Use one String[] for winning and one String[] for losing.
     * Use the boolean passed to print random messages from the matching array.
     */
    

}