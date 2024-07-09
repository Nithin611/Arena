public class Arena {
    public static void fight(Player player1, Player player2) {
        Dice attackDice = new Dice(6);
        Dice defendDice = new Dice(6);
        Player currentPlayer = (player1.getHealth() < player2.getHealth()) ? player1 : player2;
        Player opponent = (currentPlayer == player1) ? player2 : player1;

        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            currentPlayer.attack(opponent, attackDice, defendDice);
            Player temp = currentPlayer;
            currentPlayer = opponent;
            opponent = temp;
        }

        if (player1.getHealth() > 0) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
