public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public void attack(Player opponent, Dice attackDice, Dice defendDice) {
        int attackRoll = attackDice.roll();
        int defendRoll = defendDice.roll();
        int attackDamage = attack * attackRoll;
        int defendStrength = opponent.strength * defendRoll;
        int damageDealt = Math.max(0, attackDamage - defendStrength);
        opponent.reduceHealth(damageDealt);
        System.out.println("Attacker rolled: " + attackRoll + " Defender rolled: " + defendRoll);
        System.out.println("Damage dealt: " + damageDealt);
    }
}
