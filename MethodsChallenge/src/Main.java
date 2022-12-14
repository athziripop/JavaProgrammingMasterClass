public class Main {
    public static void main(String[] args) {
        displayHighScorePosition("Player 1", calculateHighScorePosition(1500));
        displayHighScorePosition("Player 2", calculateHighScorePosition(900));
        displayHighScorePosition("Player 3", calculateHighScorePosition(400));
        displayHighScorePosition("Player 4", calculateHighScorePosition(50));
    }
    public static void displayHighScorePosition(String player, int position){
        System.out.println(player + " managed to get into position " + position + " on the high score table") ;

    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000) return 1;
        else if (score >= 500) return 2;
        else if (score >= 100) return 3;
        return 4;
    }
}