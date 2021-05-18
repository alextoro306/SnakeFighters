
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class HeroSnake {
    Scanner sc = new Scanner(System.in);
    ArrayList<EnemySnake> EnemyList = new ArrayList<>();
    Random r = new Random();
    private EnemySnake e;
    private String name, type, story;
    private int age;
    private double health, attack;


    public HeroSnake(String n, String t, String s, int a, double h, double att, ArrayList<EnemySnake> ListEnemy) {
        this.name = n;
        this.type = t;
        this.story = s;
        this.age = a;
        this.health = h;
        this.attack = att;
        this.EnemyList = ListEnemy;
        EnemySnake anaconda = new EnemySnake("Anaconda", "Strangler Snake", "A strong strangler snake who fears nothing.", 5, 90, 50);
        EnemySnake cobra = new EnemySnake("Cobra", "Poisonous Snake", "A peaceful snake, but if you make him angry it will not be fun.", 10, 95, 55);
        EnemySnake python = new EnemySnake("Python", "Strangler Snake", "Python knows what he came for, and will strangle you.", 20, 105, 50);
        EnemySnake mamba = new EnemySnake("Mamba", "Poisonous Snake", "Mamba will destroy enemy after enemy, and only leaves a mark.", 9, 100, 45);
        EnemySnake kingsnake = new EnemySnake("KingSnake", "Mind Control Snake", "The kingsnake is the king of all snakes and has won every fight in its lifetime.", 100, 150, 60);
        EnemyList.add(anaconda);
        EnemyList.add(cobra);
        EnemyList.add(python);
        EnemyList.add(mamba);
        EnemyList.add(kingsnake);

    }

    public EnemySnake getREnemy(int i) {
        switch (i){
            case 0:
                e = EnemyList.get(0);
                break;
            case 1:
                e = EnemyList.get(1);
                break;
            case 2:
                e = EnemyList.get(2);
                break;
            case 3:
                e = EnemyList.get(3);
                break;
            case 4:
                e = EnemyList.get(4);
                break;
        }
        return e;
    }

    public void removeSnake(int n) {
        EnemyList.remove(n);
    }

    public ArrayList getEnemies() {
        return EnemyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }


    public void fightEnemy(EnemySnake e) {
        System.out.println("Herosnake: Good job! You just dealt " + attack + " damage to an enemy snake, be careful he is very strong!");
        double newHealth = e.getHealth() -getAttack();
        e.setHealth(newHealth);
        System.out.println(e.getName() + " Has now: " + e.getHealth() + " hp left");

        System.out.println(e.getName() + ": Hahaha i am the enemy snake and i just hurt you muhahaha!");
        double newHealth2 = getHealth() - e.getAttack();
        setHealth(newHealth2);
        System.out.println("Hero snake has now: " + getHealth() + " hp left");

        System.out.println("Type m to continue the game.");
        String choose = sc.nextLine();
        if (choose.equals("m")) {

            System.out.println("Herosnake: Well done! You just dealt " + attack + " damage to an enemy snake, he is now weak!");
            double newHealth3 = e.getHealth() -getAttack();
            e.setHealth(newHealth3);
            System.out.println(e.getName() + ": Has now " + e.getHealth() + " hp left");

            System.out.println(e.getName() + ": You are so noob. I made you alot of damage haha!");
            double newHealth4 = getHealth() - e.getAttack();
            setHealth(newHealth4);
            System.out.println("Hero snake has now: " + getHealth() + " hp left");

        } else {
            System.out.println("You did not type m, please try again.");
        }

        System.out.println("Type m again to continue the game.");
        String choose2 = sc.nextLine();
        if (choose2.equals("m")) {

            System.out.println(e.getName() + ": Easy damage to you i will WIN!");
            double newHealth5 = getHealth() - e.getAttack();
            setHealth(newHealth5);
            System.out.println("Hero snake has now: " + getHealth() + " hp left");

            System.out.println("Herosnake: Very good! You just dealt " + attack + " damage to an enemy snake, he is now VERY weak!");
            double newHealth6 = e.getHealth() -getAttack();
            e.setHealth(newHealth6);
            System.out.println(e.getName() + ": Has now " + e.getHealth() + " hp left");

        } else {
            System.out.println("You did not type m, please try again.");
        }

    }





        @Override
        public String toString(){
            return "Hero name: " + name + "\nHero type: " + type + "\nHero story: " + story + "\nHero age: " + age + "\nHero health: " + health + "\nHero attack: " + attack;
        }

    }


