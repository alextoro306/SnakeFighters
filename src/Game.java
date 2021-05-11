import java.util.ArrayList;

public class Game {
    public void run() {
        ArrayList<EnemySnake>list = new ArrayList<>();
        HeroSnake hero = new HeroSnake("Sankarikäärme", "Letku", "Hän on kokenut taistelija ja voittaa kaikki vihollisensa", 18, 300, 35, list);
        System.out.println("Welcome to SnakeFighters! You are the " + hero + "And you want to Strangle all the other snakes!");
        System.out.println("Type play in any form to start.");
        hero.makeDecision();
        System.out.println(hero.getEnemies());
    }
}
