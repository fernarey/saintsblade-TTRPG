
// PLAYER OBJECT CLASS

public class player {
    // FIELDS
    private String characterName;
    private int maxHealth;
    private int currentHealth;

    // CONSTRUCTOR
    public Player (String characterName, int maxHealth, int currentHealth) {
    this.characterName = characterName;
    this.maxHealth = maxHealth;
    this.currentHealth = currentHealth;
    }

    public int getHealth() {
        return this.currentHealth;
    }

    public int damageTaken() {

    }
}
