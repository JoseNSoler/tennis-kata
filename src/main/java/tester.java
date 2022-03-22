
/*
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TennisGame1 implements TennisGame {


        private int m_score1 = 0;
        private int m_score2 = 0;
        private String player1Name;
        private String player2Name;



        public TennisGame1(String player1Name, String player2Name) {
            this.player1Name = player1Name;
            this.player2Name = player2Name;
        }

    public Map<Integer, String> pointsMap(){
        Map<Integer, String> points = new HashMap<>();
        points.put(0, "Love");
        points.put(1, "Fifteen");
        points.put(2, "Thirty");
        points.put(3, "Forty");

        return points;
    }

        public void wonPoint(String playerName) {
            if (playerName == "player1")
                m_score1 += 1;
            else
                m_score2 += 1;
        }

        public String getScore(){
            StringBuilder builder = new StringBuilder();
            if(m_score1==m_score2){
                builder.append(allScore());
            }
        }


        public String allScore(){
            String allStr = "";

            for(Map.Entry<Integer, String> points : pointsMap().entrySet()){
                if(points.getKey() == m_score1) allStr += points.getValue();
            }

            return allStr += "-All";
        }
*/
/*

        public String getScore() {
            String score = "";
            int tempScore=0;
            if (m_score1==m_score2)
            {

                switch (m_score1)
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
                    default:
                        score = "Deuce";
                        break;

                }
            }
            else if (m_score1>=4 || m_score2>=4)
            {

                int minusResult = m_score1-m_score2;
                String advantageStr = "";
                advantageStr += (minusResult==1) ? "Advantage " :
                    (minusResult>=2) ? advantageStr += "Win for" : ""


                if (minusResult==1) score ="Advantage player1";
                else if (minusResult ==-1) score ="Advantage player2";
                else if (minusResult>=2) score = "Win for player1";
                else score ="Win for player2";
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = m_score1;
                    else {
                        score+="-";
                        tempScore = m_score2;
                    }

                    switch(tempScore)
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

*/
