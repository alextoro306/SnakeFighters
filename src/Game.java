
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Game {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public void run() {
        ArrayList<EnemySnake> list = new ArrayList<>();
        ArrayList<EnemySnake> EnemyList = new ArrayList<>();
        EnemySnake kingsnake = new EnemySnake("KingSnake", "Mind Control Snake", "The kingsnake is the king of all snakes and has won every fight in its lifetime.", 100, 105);
        HeroSnake hero = new HeroSnake("HeroSnake", "Snake", "He is an experienced fighter. and can beat almost any enemy.", 18, 409, list, false);
        System.out.println("__          __  _                                 _              _____             _        ______ _       _     _                \n" +
                "\\ \\        / / | |                               | |            / ____|           | |      |  ____(_)     | |   | |               \n" +
                " \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___ ______| |_ ___ _____| (___  _ __   __ _| | _____| |__   _  __ _| |__ | |_ ___ _ __ ___ \n" +
                "  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\______| __/ _ \\______\\___ \\| '_ \\ / _` | |/ / _ \\  __| | |/ _` | '_ \\| __/ _ \\ '__/ __|\n" +
                "   \\  /\\  /  __/ | (_| (_) | | | | | |  __/      | || (_) |     ____) | | | | (_| |   <  __/ |    | | (_| | | | | ||  __/ |  \\__ \\\n" +
                "    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|       \\__\\___/     |_____/|_| |_|\\__,_|_|\\_\\___|_|    |_|\\__, |_| |_|\\__\\___|_|  |___/\n" +
                "                                                                                                      __/ |                       \n" +
                "                                                                                                     |___/   ");


            int enemiesKilled = 0;
            while (hero.getHealth() > 0 && enemiesKilled != 4) {
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
                    System.out.println("You have a health of 800 and an attack of 35.");


                } else {
                    System.out.println("You did not type c, try again.");
                    run();

                }
                System.out.println("Type p to play.");
                String play = sc.nextLine();
                if (play.equals("p")) {
                    boolean continueGame;
                    continueGame = hero.fightEnemy(e1);
                    if (continueGame == false){
                        System.out.println("Press r to restart");
                        String rstart = sc.nextLine();
                        if (rstart.equals("r")){
                            run();
                        }
                    }
                    hero.setHasFled(false);
                    enemiesKilled++;

                } else {
                    System.out.println("You did not type p, try again.");
                    run();
                }
                int random2 = r.nextInt(hero.getListSize(hero.EnemyList));
                EnemySnake e2 = hero.getREnemy(random2);
                hero.removeSnake(random2);
                hero.setHasFled(false);
                hero.setHealth(409);
                System.out.println();
                System.out.println("You drank a health potion, and regained all of your " + hero.getHealth() + " health.\n");
                System.out.println("Type x, to choose the next enemy.");
                String next = sc.nextLine();
                if (next.equals("x")) {
                    System.out.println("Here is your enemy's stats:\n" + e2);
                    System.out.println("");
                    boolean continueGame;
                    continueGame = hero.fightEnemy(e2);
                    if (continueGame == false){
                        System.out.println("Press r to restart");
                        String rstart = sc.nextLine();
                        if (rstart.equals("r")){
                            run();
                        }
                    }
                    enemiesKilled++;
                }
                int random3 = r.nextInt(hero.getListSize(hero.EnemyList));
                EnemySnake e3 = hero.getREnemy(random3);
                hero.removeSnake(random3);
                hero.setHasFled(false);
                hero.setHealth(409);
                System.out.println();
                System.out.println("You drank a health potion, and regained all of your " + hero.getHealth() + " health.\n");
                System.out.println("Type z, to choose the next enemy.");
                String next2 = sc.nextLine();
                if (next2.equals("z")) {
                    System.out.println("Here is your enemy's stats:\n" + e3);
                    System.out.println("");
                    boolean continueGame;
                    continueGame = hero.fightEnemy(e3);
                    if (continueGame == false){
                        System.out.println("Press r to restart");
                        String rstart = sc.nextLine();
                        if (rstart.equals("r")){
                            run();
                        }
                    }
                    enemiesKilled++;
                }
                int random4 = r.nextInt(hero.getListSize(hero.EnemyList));
                EnemySnake e4 = hero.getREnemy(random4);
                hero.removeSnake(random4);
                hero.setHasFled(false);
                hero.setHealth(409);
                System.out.println();
                System.out.println("You drank a health potion, and regained all of your " + hero.getHealth() + " health.\n");
                System.out.println("Type q, to choose the next enemy.");
                String next3 = sc.nextLine();
                if (next3.equals("q")) {
                    System.out.println("Here is your next enemy's stats:\n" + e4);
                    System.out.println("");
                    boolean continueGame;
                    continueGame = hero.fightEnemy(e4);
                    if (continueGame == false){
                        System.out.println("Press r to restart");
                        String rstart = sc.nextLine();
                        if (rstart.equals("r")){
                            run();
                        }
                    }
                    enemiesKilled++;
                }
            }



        System.out.println("Type f, to take on the final boss!");
        String userInput = sc.nextLine();
        if (userInput.equals("f")) {
            System.out.println("Here is your final boss stats:\n" + kingsnake);
            System.out.println("");
            hero.setHasFled(false);
            hero.setHealth(409);
            System.out.println();
            System.out.println("You drank a health potion, and regained all of your " + hero.getHealth() + " health.\n");
            hero.fightEnemy(kingsnake);
            System.out.println("");

        }

        System.out.println("Thanks for playing our game (SnakeFighters) \nHave a nice day -Olavi -Alex");
        System.out.println("Game over!");
    }


    }

