package homework5.Game;

public class Enemy {
    private static final int HERO_DEFEATED_HEALTH = 0;
    static final int ENEMY_MIN_START_HEALTH = 100;
    static final int ENEMY_MAX_START_HEALTH = 201;
    static final int ENEMY_MIN_START_STRENGTH = 3;
    static final int ENEMY_MAX_START_STRENGTH = 9;
    static final int ENEMY_MIN_START_LEVEL = 1;

    double health;
    double strength;
    int level;


    Enemy(int health, double strength, int level) {
        this.health = health;
        this.strength = strength;
        this.level = level;
    }

    void attack(Hero hero) {
        if (hero.currentHealth < this.strength) {
            hero.currentHealth = HERO_DEFEATED_HEALTH;
        } else {
            hero.currentHealth -= this.strength;
        }
    }
}
