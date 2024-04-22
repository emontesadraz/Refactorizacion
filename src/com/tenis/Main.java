package com.tenis;

/**
 * Main class for the tennis scoring application.
 */
public class Main {

    String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};
    String [] score2 = {"Love-All", "Fifteen-All", "Thirty-All", "Forty-All", "Deuce"};
    /**
     * This method calculates and returns the tennis score for player 1 and player 2.
     *
     * @param pointsPlayer1 The score of the first player.
     * @param pointsPlayer2 The score of the second player.
     * @return The game score as a String.
     */
    public static String getScore(int pointsPlayer1, int pointsPlayer2) {
        String score = "";
        int auxScore=0;

        // Check if the scores are equal
        if (pointsPlayer1 == pointsPlayer2) {
            score = pointName(pointsPlayer1);
        }
        // Check if either player has 4 or more points
        else if (pointsPlayer1 >=4 || pointsPlayer2 >=4)
        {
            score = advantagePoints(pointsPlayer1, pointsPlayer2);
        }
        // If neither of the above conditions are met, calculate the score when the points are not equal and less than 4
        else
        {
            score = drawPuntuation(pointsPlayer1, pointsPlayer2, score);
        }
    return score;
    }

    /**
     * This method calculates and returns the score when both players have 4 or more points.
     *
     * @param pointsPlayer1 The score of the first player.
     * @param pointsPlayer2 The score of the second player.
     * @return The game score as a String.
     */
    private static String advantagePoints(int pointsPlayer1, int pointsPlayer2) {
        String score;
        int advantagePlayer = pointsPlayer1 - pointsPlayer2;
        // Check if player 1 has an advantage
        if (advantagePlayer==1) score ="Advantage player1";
        // Check if player 2 has an advantage
        else if (advantagePlayer ==-1) score ="Advantage player2";
        // Check if player 1 has won
        else if (advantagePlayer>=2) score = "Win for player1";
        // If none of the above conditions are met, player 2 has won
        else score ="Win for player2";
        return score;
    }

    /**
     * This method calculates and returns the score when neither player has reached 4 points and the points are not equal.
     *
     * @param pointsPlayer1 The score of the first player.
     * @param pointsPlayer2 The score of the second player.
     * @param score The current game score.
     * @return The game score as a String.
     */
    private static String drawPuntuation(int pointsPlayer1, int pointsPlayer2, String score) {
        int auxScore;
        // Loop through the scores of both players
        for (int i = 1; i<3; i++)
        {
            if (i==1) auxScore = pointsPlayer1;
            else { score +="-"; auxScore = pointsPlayer2;}
            // Convert the numerical score to the corresponding tennis score
            switch(auxScore)
            {
                case 0:
                    score += "Love";
                case 1:
                    score +="Fifteen";
                    break;
                case 2:
                    score +="Thirty";
                    break;
                case 3:
                    score +="Forty";
                    break;
            }
        }
        return score;
    }

    /**
     * This method returns the score of the players when they are tied.
     *
     * @param pointsPlayer1 The score of the first player.
     * @return The game score as a String.
     */
    private static String pointName(int pointsPlayer1) {
        String score;
        // Convert the numerical score to the corresponding tennis score
        switch (pointsPlayer1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}