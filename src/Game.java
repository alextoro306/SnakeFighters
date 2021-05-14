
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Game {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);
    public void run() {
        ArrayList<EnemySnake>list = new ArrayList<>();
        ArrayList<EnemySnake> EnemyList = new ArrayList<>();
        HeroSnake hero = new HeroSnake("HeroSnake", "Snake", "He is an experienced fighter. and will beat almost any enemy.", 18, 300, 35, list);
        System.out.println("Welcome to SnakeFighters! You are the HeroSnake And you want to Strangle all the other snakes!");
        System.out.println("Type s to start.");
        String push = sc.nextLine();
        if (push.equals("s")) {
            System.out.println("You will now randomly choose an enemy.");
        }else{
            System.out.println("You did not type s, try again.");
            run();
        }
        System.out.println("Type c to choose an enemy.");
        String choose = sc.nextLine();
        if (choose.equals("c")) {
            System.out.println("Here is your hero stats:\n" + hero);
            System.out.println("");
            System.out.println("Here is your enemy stats: ");
            int random = r.nextInt(4);
            System.out.println(hero.getREnemy(random));
            EnemySnake e1 = hero.getREnemy(random);
            hero.firstAttack(e1);

        }else{
            System.out.println("You did not type c, try again.");
            run();
        }






    }
}
