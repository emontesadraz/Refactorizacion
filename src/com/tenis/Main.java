package com.tenis;

/**
 * Esta es la main de la aplicación
 */
public class Main {
    /**
     * Este metodo calcula y devuelve la puntuacion de tenis de el jugador 1 y el jugador 2
     *
     * @param pointsPlayer1 La puntuación del primer jugador
     * @param pointsPlayer2 La puntuacion del segundo jugador
     * @return La puntuacion del juego como un String
     */
    public static String getScore(int pointsPlayer1, int pointsPlayer2) {
        String score = "";
        int auxScore=0;

        if (pointsPlayer1 == pointsPlayer2) {
            score = pointName(pointsPlayer1);
        }
        else if (pointsPlayer1 >=4 || pointsPlayer2 >=4)
        {
            score = advantagePoints(pointsPlayer1, pointsPlayer2);
        }
        else
        {
            score = drawPuntuation(pointsPlayer1, pointsPlayer2, score);

        }
    return score;
    }

    /**
     * Este metodo calcula y devuelve la puntuacion cuando los dos jugadores tienen 4 o mas puntos
     *
     * @param pointsPlayer1 La puntuacion del primer jugador
     * @param pointsPlayer2 La puntuacion del segundo jugador
     * @return La puntuacion del juego como un String
     */
    private static String advantagePoints(int pointsPlayer1, int pointsPlayer2) {
        String score;
        int advantagePlayer = pointsPlayer1 - pointsPlayer2;
        if (advantagePlayer==1) score ="Advantage player1";
        else if (advantagePlayer ==-1) score ="Advantage player2";
        else if (advantagePlayer>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    /**
     * Este metodo calcula y devuelve la puntuacion cuando ninguno de los dos jugadores ha llegado a 4 puntos y los puntos no son iguales
     *
     * @param pointsPlayer1 La puntuacion del primer jugador
     * @param pointsPlayer2 La puntuacion del segundo jugador
     * @param score La puntuacion actual del juego
     * @return La puntuacion del juego como un String
     */
    private static String drawPuntuation(int pointsPlayer1, int pointsPlayer2, String score) {
        int auxScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) auxScore = pointsPlayer1;
            else { score +="-"; auxScore = pointsPlayer2;}
            switch(auxScore)
            {
                case 0:
                    score +="Love";
                    break;
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
     * Este devuelve la puntuacion de los jugadores cuando estan empatados
     *
     * @param pointsPlayer1 La puntuacion del primer jugador
     * @return La puntuacion del juego como un String
     */
    private static String pointName(int pointsPlayer1) {
        String score;
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