public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);
        Arena.fight(player1, player2);
    }
}
