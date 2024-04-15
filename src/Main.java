public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int pointsPlayer1, int pointsPlayer2) {
        String score = "";
        int auxScore=0;

        if (pointsPlayer1 == pointsPlayer2) {
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
        }
        else if (pointsPlayer1 >=4 || pointsPlayer2 >=4)
        {
            int advantagePlayer = pointsPlayer1-pointsPlayer2;
            if (advantagePlayer==1) score ="Advantage player1";
            else if (advantagePlayer ==-1) score ="Advantage player2";
            else if (advantagePlayer>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) auxScore = pointsPlayer1;
                else { score+="-"; auxScore = pointsPlayer2;}
                switch(auxScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }

        }
    return score;
    }
}