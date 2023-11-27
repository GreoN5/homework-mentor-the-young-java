package homework5.Game;

public class Enemy {
    static final int ENEMY_MIN_START_HEALTH = 100;
    static final int ENEMY_MAX_START_HEALTH = 201;
    static final int ENEMY_MIN_START_STRENGTH = 3;
    static final int ENEMY_MAX_START_STRENGTH = 9;
    static final int ENEMY_MIN_START_LEVEL = 1;
    private static final int HERO_DEFEATED_HEALTH = 0;
    private static final int ENEMY_DEFAULT_HEALTH = 150;
    private static final int ENEMY_DEFAULT_STRENGTH = 4;

    private double health;
    private double strength;
    private double baseStrength;
    private int level;

    public Enemy() {
        health = ENEMY_DEFAULT_HEALTH;
        strength = ENEMY_DEFAULT_STRENGTH;
        baseStrength = ENEMY_DEFAULT_STRENGTH;
        level = ENEMY_MIN_START_LEVEL;
    }

    public Enemy(int health, double strength, int level) {
        baseStrength = strength;
        this.health = health;
        this.strength = strength;
        this.level = level;
    }

    public double getHealth() {
        return health;
    }

    public double getStrength() {
        return strength;
    }

    public int getLevel() {
        return level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void decreaseHealth(double health) {
        if (health > 0) {
            this.health -= health;
        } else {
            System.out.println("Health must be greater than 0.");
        }
    }

    public void increaseStrength(int strength) {
        if (strength > 0) {
            this.strength += strength;
        } else {
            System.out.println("Strength must be greater than 0.");
        }
    }

    public void resetToBaseStrength() {
        strength = baseStrength;
    }

    public void attack(Hero hero) {
        if (hero.getCurrentHealth() < strength) {
            hero.setCurrentHealth(HERO_DEFEATED_HEALTH);
        } else {
            hero.decreaseCurrentHealth(strength);
        }
    }

    public void displayEnemyStats() {
        System.out.println(
                "Enemy stats are:" +
                        "\nCurrent health: " + health +
                        "\nLevel: " + level +
                        "\nStrength: " + strength);
    }

    /**
     *
     * @param enemy an enemy to compare to the current instance
     * @return the weaker enemy between both or default one if they are same
     */
    public Enemy compareEnemy(Enemy enemy) {
        boolean isEqualStrength = this.strength == enemy.getStrength();

        if (isEqualStrength && this.health == enemy.getHealth()) {
            return getDefaultEnemy(enemy);
        }

        if (isEqualStrength) {
            if (this.health > enemy.getHealth()) {
                return enemy;
            } else {
                return this;
            }
        }

        return this.strength > enemy.getStrength() ? enemy : this;
    }

    private Enemy getDefaultEnemy(Enemy enemy) {
        if (enemy.getHealth() == ENEMY_DEFAULT_HEALTH && enemy.getLevel() == ENEMY_MIN_START_LEVEL && enemy.getStrength() == ENEMY_DEFAULT_STRENGTH) {
            return enemy;
        }

        return this;
    }
}
