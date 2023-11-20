package homework5.Game;

import java.util.Random;

public class Hero {
    private static final int ENEMY_DEFEATED_HEALTH = 0;
    private static final int EXPERIENCE_LOST_AVOIDING_ENEMY = 10;
    private static final int MIN_EXPERIENCE = 0;
    private static final int HEALTH_INCREASE_LEVEL_UP = 100;
    private static final int MAX_HEALTH_DEFAULT = 100;
    private static final int BELOW_MIN_HEALTH = 50;
    private static final int AVOID_ENEMY_HEALTH_REGEN = 50;
    private static final int START_LEVEL = 1;
    private static final int MIN_STRENGTH_START = 5;
    private static final int MAX_STRENGTH_START = 11;
    private static final int MIN_STRENGTH_LEVEL_UP_INCREASE = 3;
    private static final int MAX_STRENGTH_LEVEL_UP_INCREASE = 7;
    private static final String DEFAULT_NAME = "Hero";

    String name;
    int maxHealth;
    double currentHealth;
    double strength;
    int level;
    int experience;

    Hero() {
        Random rand = new Random();

        maxHealth = MAX_HEALTH_DEFAULT;
        currentHealth = MAX_HEALTH_DEFAULT;
        level = START_LEVEL;
        experience = MIN_EXPERIENCE;
        strength = rand.nextInt(MIN_STRENGTH_START, MAX_STRENGTH_START);
        name = DEFAULT_NAME;
    }

    Hero(String name) {
        this();
        this.name = name;
    }

    void attack(Enemy enemy) {
        if (enemy.health < this.strength) {
            enemy.health = ENEMY_DEFEATED_HEALTH;
        } else {
            enemy.health -= this.strength;
        }
    }

    void avoid() {
        if (maxHealth - currentHealth < BELOW_MIN_HEALTH) {
            currentHealth = maxHealth;
        } else {
            currentHealth += AVOID_ENEMY_HEALTH_REGEN;
        }

        if (this.experience >= EXPERIENCE_LOST_AVOIDING_ENEMY) {
            this.experience -= EXPERIENCE_LOST_AVOIDING_ENEMY;
        } else {
            experience = MIN_EXPERIENCE;
        }
    }

    void levelUp() {
        level++;
        maxHealth += HEALTH_INCREASE_LEVEL_UP;
        currentHealth = maxHealth;

        Random rand = new Random();
        int additionalStrength = rand.nextInt(MIN_STRENGTH_LEVEL_UP_INCREASE, MAX_STRENGTH_LEVEL_UP_INCREASE);
        strength += additionalStrength;

        experience = MIN_EXPERIENCE;
        System.out.println("Your level has increased to " + level);
    }

    void showStatsInfo() {
        System.out.println("Your current stats are:");
        System.out.println("Current health: " + currentHealth);
        System.out.println("Max health: " + maxHealth);
        System.out.println("Level: " + level);
        System.out.println("Experience: " + experience);
        System.out.println("Strength: " + strength);
    }
}
