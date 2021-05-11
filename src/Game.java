import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    Scanner sc = new Scanner(System.in);
    public void run() {
        ArrayList<EnemySnake>list = new ArrayList<>();
        HeroSnake hero = new HeroSnake("HeroSnake", "Snake", "He is an experienced fighter. and will beat almost any enemy.", 18, 300, 35, list);
        System.out.println("Welcome to SnakeFighters! You are the HeroSnake And you want to Strangle all the other snakes!");
        System.out.println("Press any button to start.");
        hero.makeDecision();


    }
}
