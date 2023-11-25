package homework5.Game;

import java.util.Random;

public class Utils {
    public static final int ENTITY_NO_HEALTH = 0;
    public static final int MAX_ROUNDS_OF_ENEMIES = 10;
    public static final int MIN_STRENGTH_HERO_START = 5;
    public static final int MAX_STRENGTH_HERO_START = 11;
    private static final int EXPERIENCE_DEFEATED_ENEMY = 50;
    private static final int CRITICAL_HIT_STRENGTH_INCREASE = 3;
    private static final int HEALTH_AMOUNT_ADDITIONAL = 20;
    private static final int ADDITIONAL_HEALTH_CHANCE = 70;
    private static final int MAX_PERCENT_CHANCE = 100;
    private static final int CRIT_CHANCE_HERO = 70;
    private static final int CRIT_CHANCE_ENEMY = 90;

    private Utils() {}

    public static String tossCoin() {
        Random rand = new Random();
        int number = rand.nextInt(2);

        String heroTurn = "heads";
        String enemyTurn = "tails";
        if (number == 0) {
            return heroTurn;
        }

        return enemyTurn;
    }

    public static void calculateCriticalHitsOfFight(Hero hero, Enemy enemy) {
        Random random = new Random();

        int criticalChanceHero = random.nextInt(MAX_PERCENT_CHANCE);
        if (criticalChanceHero >= CRIT_CHANCE_HERO) {
            hero.increaseStrength(CRITICAL_HIT_STRENGTH_INCREASE);
        }

        int criticalChanceEnemy = random.nextInt(MAX_PERCENT_CHANCE);
        if (criticalChanceEnemy >= CRIT_CHANCE_ENEMY) {
            enemy.increaseStrength(CRITICAL_HIT_STRENGTH_INCREASE);
        }
    }

    public static void defeatedEnemySuccess(Hero hero, Enemy enemy) {
        Random random = new Random();

        int chanceOfAdditionalHealth = random.nextInt(MAX_PERCENT_CHANCE);
        if (chanceOfAdditionalHealth >= ADDITIONAL_HEALTH_CHANCE) {
            hero.increaseMaxHealth(HEALTH_AMOUNT_ADDITIONAL);
        }

        hero.setCurrentHealth(hero.getMaxHealth());
        hero.increaseExperience(EXPERIENCE_DEFEATED_ENEMY * enemy.getLevel());

        if (hero.getExperience() >= 100 * hero.getLevel()) {
            hero.levelUp();
        }
    }

    public static boolean playGameUntilWin(Hero hero, Enemy enemy) {
        boolean doesHeroWin = true;
        String firstTurn = tossCoin();

        while (true) {
            Utils.calculateCriticalHitsOfFight(hero, enemy);

            if (hero.getCurrentHealth() == Utils.ENTITY_NO_HEALTH) {
                doesHeroWin = false;
                break;
            }

            if (enemy.getHealth() == Utils.ENTITY_NO_HEALTH) {
                hero.resetToBaseStrength();
                Utils.defeatedEnemySuccess(hero, enemy);

                break;
            }

            if (firstTurn.equals("heads")) {
                hero.attack(enemy);
                enemy.attack(hero);
            } else {
                enemy.attack(hero);
                hero.attack(enemy);
            }

            hero.resetToBaseStrength();
            enemy.resetToBaseStrength();
        }

        return doesHeroWin;
    }
}
