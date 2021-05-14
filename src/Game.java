
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Game {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public void run() {
        ArrayList<EnemySnake> list = new ArrayList<>();
        ArrayList<EnemySnake> EnemyList = new ArrayList<>();
        HeroSnake hero = new HeroSnake("HeroSnake", "Snake", "He is an experienced fighter. and can beat almost any enemy.", 18, 300, 35, list);
        System.out.println("Welcome to SnakeFighters! You are the HeroSnake And you want to Strangle all the other snakes!");
        System.out.println("Type s to start.");
        String push = sc.nextLine();
        int random = r.nextInt(4);
        EnemySnake e1 = hero.getREnemy(random);
        hero.removeSnake(random);
        if (push.equals("s")) {
            System.out.println("You will now randomly choose an enemy, and display your stats.");
        } else {
            System.out.println("You did not type s, try again.");
            run();
        }
        System.out.println("Type c to randomly choose an enemy.");
        String choose = sc.nextLine();
        if (choose.equals("c")) {
            System.out.println("Here is your hero's stats:\n" + hero);
            System.out.println("");
            System.out.println("Here is your enemy's stats:\n" + e1);
            System.out.println("");


        } else {
            System.out.println("You did not type c, try again.");
            run();

        }
        System.out.println("Type p to play.");
        String play = sc.nextLine();
        if (play.equals("p")) {
            hero.firstAttack(e1);
        } else {
            System.out.println("You did not type p, try again.");
            run();
        }
        }
    }

