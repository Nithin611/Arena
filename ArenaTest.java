import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArenaTest {

    public void testPlayerCreation() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
    }


    public void testDiceRoll() {
        Dice dice = new Dice(6);
        int roll = dice.roll();
        assert(roll >= 1 && roll <= 6);
    }

    
    public void testPlayerAttack() {
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);
        Dice attackDice = new Dice(6);
        Dice defendDice = new Dice(6);
        player1.attack(player2, attackDice, defendDice);
        assert(player2.getHealth() < 100);
    }

    public void testFight() {
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);
        Arena.fight(player1, player2);
        assert(player1.getHealth() == 0 || player2.getHealth() == 0);
    }
}
