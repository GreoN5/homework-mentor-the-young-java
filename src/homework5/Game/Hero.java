package homework5.Game;

import java.util.Random;

public class Hero {
    private static final int ENEMY_DEFEATED_HEALTH = 0;
    private static final int MIN_HEALTH = 0;
    private static final int EXPERIENCE_LOST_AVOIDING_ENEMY = 10;
    private static final int MIN_EXPERIENCE = 0;
    private static final int HEALTH_INCREASE_LEVEL_UP = 100;
    private static final int MAX_HEALTH_DEFAULT = 100;
    private static final int BELOW_MIN_HEALTH = 50;
    private static final int AVOID_ENEMY_HEALTH_REGEN = 50;
    private static final int START_LEVEL = 1;
    private static final int MIN_STRENGTH_START = 7;
    private static final int MIN_STRENGTH_LEVEL_UP_INCREASE = 3;
    private static final int MAX_STRENGTH_LEVEL_UP_INCREASE = 7;
    private static final String DEFAULT_NAME = "Default Hero";

    private String name;
    private int maxHealth;
    private double currentHealth;
    private double strength;
    private int level;
    private int experience;
    private double baseStrength;

    public Hero() {
        maxHealth = MAX_HEALTH_DEFAULT;
        currentHealth = MAX_HEALTH_DEFAULT;
        level = START_LEVEL;
        experience = MIN_EXPERIENCE;
        strength = MIN_STRENGTH_START;
        baseStrength = MIN_STRENGTH_START;
        name = DEFAULT_NAME;
    }

    public Hero(String name, int health, double strength, int level, int experience) {
        maxHealth = health;
        currentHealth = health;
        baseStrength = strength;
        this.name = name;
        this.strength = strength;
        this.level = level;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public double getStrength() {
        return strength;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public void setCurrentHealth(int health) {
        if (health < MIN_HEALTH) {
            System.out.println("Please provide health value greater than or equal to 0.");
        } else {
           currentHealth = health;
        }
    }

    public void increaseMaxHealth(int healthPointsToIncrease) {
        if (healthPointsToIncrease > 0) {
            maxHealth += healthPointsToIncrease;
        } else {
            System.out.println("Health points must be greater than 0.");
        }
    }

    public void increaseExperience(int experience) {
        if (experience > 0) {
            this.experience += experience;
        } else {
            System.out.println("Experience must be greater than 0.");
        }
    }

    public void increaseStrength(int strength) {
        if (strength > 0) {
            this.strength += strength;
        } else {
            System.out.println("Strength must be greater than 0.");
        }
    }

    public void decreaseCurrentHealth(double health) {
        if (health > 0) {
            this.currentHealth -= health;
        } else {
            System.out.println("Health must be greater than 0.");
        }
    }

    public void resetToBaseStrength() {
        strength = baseStrength;
    }

    public void attack(Enemy enemy) {
        if (enemy.getHealth() < this.strength) {
            enemy.setHealth(ENEMY_DEFEATED_HEALTH);
        } else {
            enemy.decreaseHealth(strength);
        }
    }

    public void avoid() {
        if (maxHealth - currentHealth < BELOW_MIN_HEALTH) {
            currentHealth = maxHealth;
        } else {
            currentHealth += AVOID_ENEMY_HEALTH_REGEN;
        }

        if (experience >= EXPERIENCE_LOST_AVOIDING_ENEMY) {
            experience -= EXPERIENCE_LOST_AVOIDING_ENEMY;
        } else {
            experience = MIN_EXPERIENCE;
        }
    }

    public void levelUp() {
        level++;
        maxHealth += HEALTH_INCREASE_LEVEL_UP;
        currentHealth = maxHealth;

        Random rand = new Random();
        int additionalStrength = rand.nextInt(MIN_STRENGTH_LEVEL_UP_INCREASE, MAX_STRENGTH_LEVEL_UP_INCREASE);
        strength += additionalStrength;
        baseStrength = strength;

        experience = MIN_EXPERIENCE;
        System.out.println("Your level has increased to " + level);
    }

    public void displayHeroStats() {
        System.out.println(
                "Your current stats are:" +
                "\nCurrent health: " + currentHealth +
                "\nMax health: " + maxHealth +
                "\nLevel: " + level +
                "\nExperience: " + experience +
                "\nStrength: " + strength);
    }

    /**
     *
     * @param hero a hero to compare to the current instance
     * @return the better hero between both or non-default one if they are same
     */
    public Hero compareHero(Hero hero) {
        boolean isEqualStrength = this.strength == hero.getStrength();

        if (isEqualStrength && this.currentHealth == hero.getCurrentHealth()) {
            return getNonDefaultHero(hero);
        }

        if (isEqualStrength) {
            if (this.currentHealth > hero.getCurrentHealth()) {
                return this;
            } else {
                return hero;
            }
        }

        return this.strength > hero.strength ? this : hero;
    }

    private Hero getNonDefaultHero(Hero hero) {
        String heroName = hero.getName();
        if (heroName.equals(DEFAULT_NAME)) {
            return this;
        }

        return hero;
    }
}
