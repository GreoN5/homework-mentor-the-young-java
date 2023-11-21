package homework5.Game;

import java.util.Random;

public class Utils {
    static final int ENTITY_NO_HEALTH = 0;
    static final int MAX_ROUNDS_OF_ENEMIES = 10;

    static String tossCoin() {
        Random rand = new Random();
        int number = rand.nextInt(2);

        String heroTurn = "heads";
        String enemyTurn = "tails";
        if (number == 0) {
            return heroTurn;
        }

        return enemyTurn;
    }

    static void calculateCriticalHitsOfFight(Hero hero, Enemy enemy) {
        Random random = new Random();

        int criticalChanceHero = random.nextInt(100);
        if (criticalChanceHero >= 70) {
            hero.strength += 3;
        }

        int criticalChanceEnemy = random.nextInt(100);
        if (criticalChanceEnemy >= 90) {
            enemy.strength += 3;
        }
    }

    static void defeatedEnemySuccess(Hero hero, Enemy enemy) {
        Random random = new Random();

        int chanceOfAdditionalHealth = random.nextInt(100);
        if (chanceOfAdditionalHealth >= 70) {
            hero.maxHealth += 20;
        }

        hero.currentHealth = hero.maxHealth;
        hero.experience += (50 * enemy.level);

        if (hero.experience >= 100 * hero.level) {
            hero.levelUp();
        }
    }
}
