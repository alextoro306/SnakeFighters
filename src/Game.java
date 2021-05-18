
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Game {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public void run() {
        ArrayList<EnemySnake> list = new ArrayList<>();
        ArrayList<EnemySnake> EnemyList = new ArrayList<>();
        HeroSnake hero = new HeroSnake("HeroSnake", "Snake", "He is an experienced fighter. and can beat almost any enemy.", 18, 10000, 35, list);
        System.out.println("Welcome to SnakeFighters! You are the HeroSnake And you want to kill all the other snakes!");
        int enemiesKilled = 0;
        while (enemiesKilled != 4) {
            System.out.println("Type s to start.");
            String push = sc.nextLine();
            int random = r.nextInt(hero.getListSize(hero.EnemyList));
            EnemySnake e1 = hero.getREnemy(random);
            hero.removeSnake(random);
            if (push.equals("s")) {
                System.out.println("You will now randomly choose an enemy.");
            } else {
                System.out.println("You did not type s, try again.");
                run();
            }
            System.out.println("Type c to randomly choose an enemy.");
            String choose = sc.nextLine();
            if (choose.equals("c")) {
                System.out.println("Here is your enemy's stats:\n" + e1);
                System.out.println("");


            } else {
                System.out.println("You did not type c, try again.");
                run();

            }
            System.out.println("Type p to play.");
            String play = sc.nextLine();
            if (play.equals("p")) {
                hero.fightEnemy(e1);
                enemiesKilled++;

            } else {
                System.out.println("You did not type p, try again.");
                run();
            }
            System.out.println("Type x, to choose the next enemy.");
            String next = sc.nextLine();
            int random2 = r.nextInt(hero.getListSize(hero.EnemyList));
            EnemySnake e2 = hero.getREnemy(random2);
            hero.removeSnake(random2);
            if (next.equals("x")) {
                System.out.println("Here is your enemy's stats:\n" + e2);
                System.out.println("");
                hero.fightEnemy(e2);
                enemiesKilled++;
            }
            System.out.println("Type z, to choose the next enemy.");
            String next2 = sc.nextLine();
            int random3 = r.nextInt(hero.getListSize(hero.EnemyList));
            EnemySnake e3 = hero.getREnemy(random3);
            hero.removeSnake(random3);
            if (next2.equals("z")) {
                System.out.println("Here is your enemy's stats:\n" + e3);
                System.out.println("");
                hero.fightEnemy(e3);
                enemiesKilled++;
            }
            System.out.println("Type q, to choose the next enemy.");
            String next3 = sc.nextLine();
            int random4 = r.nextInt(hero.getListSize(hero.EnemyList));
            EnemySnake e4 = hero.getREnemy(random4);
            hero.removeSnake(random4);
            if (next3.equals("q")) {
                System.out.println("Here is your enemy's stats:\n" + e4);
                System.out.println("");
                hero.fightEnemy(e4);
                enemiesKilled++;
            }
        }
    }
}

