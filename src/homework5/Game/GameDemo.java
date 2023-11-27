package homework5.Game;

import java.util.Random;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 2:
        //    1.1 Да се реализира класът Hero, който има следните полета и методи:
        //    •	name
        //    •	health
        //    •	strength
        //    •	experience
        //    •	level
        //    •	attack(Enemy enemy)
        //    •	avoid()
        //    •	levelUp()
        //    1.2 Да се реализира класът Enemy, който има следните полета и методи
        //    •	health
        //    •	strength
        //    •	level
        //    •	attack(Hero hero)
        //    1.3 Да се направи демо, в което се създава един обект от тип Hero със стойности за полетата
        //    •	name – по избор
        //    •	health – 100
        //    •	experience – 0 (начални)
        //    •	strength – между 5 и 10 на произволен принцип
        //    •	level - 1
        //    1.4 В рамките на 10 итерации да се създава по 1 обект от тип Enemy със стойности на полетата
        //    •	health – между 100 и 200 на произволен принцип, умножено по нивото на Hero обекта
        //    •	strength – между 3 и 8 на произволен принцип + 10% от силата (strength) на Hero обекта
        //    •	level – между 1 и нивото на Hero обекта на произволен принцип
        //    1.5 Да се проведе битка между Hero и Enemy на следния принцип
        //    •	При генериране на чудовище, Hero може да избере дали да пропусне врага, ако е прекалено силен за него - avoid().
        //	      Ако избере да пропусне врага, точките му опит се намаляват с 10, а точките здраве увеличават с 50 или до максимума за текущото му ниво.
        //    •	Хвърля се монета, за да се определи кой ще започне – ези за Hero, тура за Enemy
        //    •	Всеки нанася по един удар на ход, като ударът намаля живота (health) на другия със силата на нанасящия го.
        //	      При всеки удар има вероятност за критичен удар – за Hero е 30%, а за Enemy е 10%. При нанасяне на критичен удар към strength се добавят допълнителни 3 единици.
        //    •	При успех за Hero, животът му се възстановява обратно до 100, като има вероятност от 30% да получи прилив на енергия след победата и към живота му да се добавят допълнителни 20 единици.
        //    •	При успех за Hero се добавят и точки опит (experience) – по 50 точки за всеки победен враг, умножени по нивото на врага.
        //	      Когато Herо достигне 100 точки, умножени по текущото му нивото (hero.experience == 100 * hero.level),
        //	      минава на следващото и точките му живот се покачват с 50, а точките сила – между 3 и 6 точки, като и двете стойности (health и strength) са умножени по старото му ниво.
        //	      Накрая точките му опит се зануляват, за да започнат да се отброяват наново.
        //    •	Играта приключва при
        //    o	Успех за Hero след 10те итерации
        //    o	Неуспех за Hero при някоя от итерациите.
        // ---------------------------------------------------------

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        Hero harry = new Hero();
        Hero martin = new Hero("Martin", 100, rand.nextInt(Utils.MIN_STRENGTH_HERO_START, Utils.MAX_STRENGTH_HERO_START), 1, 0);
        Hero strongerHero = harry.compareHero(martin);

        Enemy dragon = new Enemy();
        Enemy snake = new Enemy();
        Enemy weakerEnemy = dragon.compareEnemy(snake);
        weakerEnemy.displayEnemyStats();

        boolean doesHeroWin = Utils.playGameUntilWin(strongerHero, weakerEnemy);
        if (!doesHeroWin) {
            System.out.println(strongerHero.getName() + " failed beating the enemies. GAME OVER!");
        } else {
            System.out.println("\nDo you want to continue the game?(yes/no): ");
            String continueGame = scanner.nextLine().toLowerCase().trim();

            while (true) {
                if (continueGame.equals("yes") || continueGame.equals("no")) {
                    break;
                }

                System.out.println("Please type either 'yes' or 'no': ");
                continueGame = scanner.nextLine().toLowerCase().trim();
            }

            if (continueGame.equals("no")) {
                System.out.println("Good game!");
            } else {
                int roundsOfEnemies = Utils.MAX_ROUNDS_OF_ENEMIES;
                while (roundsOfEnemies > 0) {
                    int enemyHealth = rand.nextInt(Enemy.ENEMY_MIN_START_HEALTH, Enemy.ENEMY_MAX_START_HEALTH) * strongerHero.getLevel();
                    int enemyStrength = rand.nextInt(Enemy.ENEMY_MIN_START_STRENGTH, Enemy.ENEMY_MAX_START_STRENGTH);
                    int enemyLevel = rand.nextInt(Enemy.ENEMY_MIN_START_LEVEL, strongerHero.getLevel() + 1);

                    Enemy enemyInDungeon = new Enemy(enemyHealth, enemyStrength * (strongerHero.getStrength() * 0.1), enemyLevel);
                    strongerHero.displayHeroStats();

                    System.out.println("\nEnemy stats: ");
                    enemyInDungeon.displayEnemyStats();
                    System.out.println("Do you wish to fight or avoid it (type either fight or avoid)?: ");
                    String choiceToFight = scanner.nextLine().toLowerCase().trim();

                    while (true) {
                        if (choiceToFight.equals("fight") || choiceToFight.equals("avoid")) {
                            break;
                        }

                        System.out.println("Please type either 'fight' or 'avoid': ");
                        choiceToFight = scanner.nextLine().toLowerCase().trim();
                    }

                    if (choiceToFight.equals("avoid")) {
                        strongerHero.avoid();
                        roundsOfEnemies--;

                        continue;
                    }

                    doesHeroWin = Utils.playGameUntilWin(strongerHero, enemyInDungeon);

                    if (!doesHeroWin) {
                        System.out.println(strongerHero.getName() + " failed beating the enemies. GAME OVER!");
                        break;
                    }

                    roundsOfEnemies--;
                }

                if (roundsOfEnemies == 0) {
                    System.out.println("Congratulations! You have beaten all the monsters!");
                }
            }
        }
    }
}
