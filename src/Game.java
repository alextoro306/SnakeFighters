
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Game {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public String askPlayerInput(String message){
        System.out.println(message);
        return sc.nextLine();
    }
    public void run() {
        ArrayList<EnemySnake> list = new ArrayList<>();
        ArrayList<EnemySnake> EnemyList = new ArrayList<>();
        EnemySnake kingsnake = new EnemySnake("KingSnake", "Mind Control Snake", "The kingsnake is the king of all snakes and has won every fight in its lifetime.", 100, 800);
        HeroSnake hero = new HeroSnake("HeroSnake", "Snake", "He is an experienced fighter. and can beat almost any enemy.", 18, 439, list, false);
        System.out.println("__          __  _                                 _              _____             _        ______ _       _     _                \n" +
                "\\ \\        / / | |                               | |            / ____|           | |      |  ____(_)     | |   | |               \n" +
                " \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___ ______| |_ ___ _____| (___  _ __   __ _| | _____| |__   _  __ _| |__ | |_ ___ _ __ ___ \n" +
                "  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\______| __/ _ \\______\\___ \\| '_ \\ / _` | |/ / _ \\  __| | |/ _` | '_ \\| __/ _ \\ '__/ __|\n" +
                "   \\  /\\  /  __/ | (_| (_) | | | | | |  __/      | || (_) |     ____) | | | | (_| |   <  __/ |    | | (_| | | | | ||  __/ |  \\__ \\\n" +
                "    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|       \\__\\___/     |_____/|_| |_|\\__,_|_|\\_\\___|_|    |_|\\__, |_| |_|\\__\\___|_|  |___/\n" +
                "                                                                                                      __/ |                       \n" +
                "                                                                                                     |___/   ");

        String jos = askPlayerInput("Press h to hear the story, press any other button to continue without a story.");
        if (jos.equals("h")) {
            System.out.println("The Herosnake was kicked out of his snake herd as a child, and want's bloody revenge for the other snakes.\nHe will show to them that it was not worth kicking him out.");
            System.out.println();

        }
        int enemiesKilled = 0;
        EnemySnake enemySnake = null;
        while (hero.getHealth() > 0 && enemiesKilled != 4) {
            String choose = askPlayerInput("Type c to randomly choose an enemy.");
            int random = r.nextInt(hero.getListSize(hero.EnemyList));
            enemySnake = hero.getREnemy(random);
            hero.removeSnake(random);
            if (choose.equals("c")) {
                System.out.println("Here is your enemy's stats:\n" + enemySnake);
                System.out.println("");
            } else {
                System.out.println("You did not type c, try again.");
                run();
            }
            boolean continueGame;
            continueGame = hero.fightEnemy(enemySnake, false);
            if (continueGame == false) {
                String rstart = askPlayerInput("Press any button to restart.");
                run();
            }
            hero.setHasFled(false);
            hero.setHealth(439);
            System.out.println("You drank a health potion, and regained all of your " + hero.getHealth() + " health.");
            enemiesKilled++;

        }
        String userInput = askPlayerInput("Type f, to take on the final boss!");
        if (userInput.equals("f")) {
            System.out.println("Here is your final boss stats:\n" + kingsnake);
            System.out.println("");
            hero.setHasFled(false);
            hero.fightEnemy(kingsnake, true);
            System.out.println("");
            System.out.println("Thanks for playing our game (SnakeFighters) \nHave a nice day -Olavi -Alex");
        }
    }
}
