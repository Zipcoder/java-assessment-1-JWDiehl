package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        //Need to write a method to get the winning move against a given hand sign

        //Utilizing a switch
        switch (handSign.toLowerCase()) {
            case "rock":
                return "paper";
            case "paper":
                return "scissor";
            case "scissor":
                return "rock";
        }
        return null;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        //Need to write a method to get the losing move against a given hand sign

        //Utilizing a switch for scenario building
        switch (handSign.toLowerCase()) {
            case "rock":
                return "scissor";
            case "paper":
                return "rock";
            case "scissor":
                return "paper";
        }
        return null;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        //Given two Strings, named handSignOfPlayer1, and handSignOfPlayer2, representative of the hand signs of two Rock Paper Scissor players,
        // return the String representation of the hand sign which would be the victor.

        //Need to write a method to figure out the winner between two players based on their respective hand signs (rock, paper, scissor)

        String winningMove = getWinningMove(handSignOfPlayer1);

        if (winningMove.equals(handSignOfPlayer2)) {
            return handSignOfPlayer2;
        } else if (handSignOfPlayer1.equals(handSignOfPlayer2)) {
            return "Tie!";
        } else {
            return handSignOfPlayer1;
        }



//        String winningMove = getWinningMove(handSignOfPlayer1);
//
//        //If statement to check if player 1's move equals player 2's move
//        if (winningMove.equals(handSignOfPlayer2)) {
//            return handSignOfPlayer1; //player1 wins!
//        } else if (handSignOfPlayer1.equals(handSignOfPlayer2)) {
//            return "Tie"; // Tie - the same hand-sign for both players 1 and 2
//        } else {
//            return handSignOfPlayer2; //player2 wins!
//        }
    }
}
