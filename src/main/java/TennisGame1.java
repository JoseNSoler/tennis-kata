import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TennisGame1 implements TennisGame {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;


    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }


    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String allScore(){
        // Posibles resultados organizados en base a su valor en puntaje: Love = 0, Fifteen = 1 ...
        String[] points = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        String currentScore = points[m_score1];
        return (m_score1 == m_score2) ?
                currentScore + "-All" : currentScore + "-" + points[m_score2];
    }

    public String advantageScore(){
        // Saber nombre del jugador con mayor puntaje
        String mostPoint = m_score1 > m_score2 ? player1Name : player2Name;

        return ((m_score1 - m_score2) * (m_score1-m_score2) == 1) ?
                "Advantage " + mostPoint : "Win for " + mostPoint;
    }

    public String getScore() {
        // Determinar entre los 3 resultados posibles: Juego ganado, empatado y puntos del juego
        return (m_score1 < 4 && m_score2 < 4 && !(m_score1 + m_score2 == 6)) ?
                allScore() : (m_score1 == m_score2) ? "Deuce" : advantageScore();
    }
}
