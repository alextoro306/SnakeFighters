
import org.w3c.dom.ls.LSOutput;

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
        EnemySnake anaconda = new EnemySnake("Anaconda", "Strangler Snake", "A strong strangler snake who fears nothing.", 5, 105, 50);
        EnemySnake cobra = new EnemySnake("Cobra", "Poisonous Snake", "A peaceful snake, but if you make him angry it will not be fun.", 10, 105, 55);
        EnemySnake python = new EnemySnake("Python", "Strangler Snake", "Python knows what he came for, and will strangle you.", 20, 105, 50);
        EnemySnake mamba = new EnemySnake("Mamba", "Poisonous Snake", "Mamba will destroy enemy after enemy, and only leaves a mark.", 9, 105, 45);
        EnemyList.add(anaconda);
        EnemyList.add(cobra);
        EnemyList.add(python);
        EnemyList.add(mamba);

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

        }
        return e;
    }


    public int getListSize(ArrayList EnemyList) {
        return EnemyList.size();
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

    public boolean checkHealth(){
        if(health > 0){
            return true;

        }else{
            return false;
        }


    }

    public void fightEnemy(EnemySnake e) {
        System.out.println("Herosnake: Good job! You just dealt " + attack + " damage to " + e.getName() + ", be careful he is very strong!");
        double newHealth = e.getHealth() -getAttack();
        e.setHealth(newHealth);
        System.out.println(e.getName() + ": " + e.getHealth() + " hp left");

        System.out.println(e.getName() + ": Hahaha i am the shhh... " + e.getName() +" shhhh.. and i just attacked you!");
        double newHealth2 = getHealth() - e.getAttack();
        setHealth(newHealth2);
        System.out.println("Hero snake: " + getHealth() + " hp left");

        System.out.println("Type m to continue the game.");
        String choose = sc.nextLine();
        if (choose.equals("m")) {

            System.out.println("Herosnake: Well done! You just dealt " + attack + " damage to an enemy snake, he is now weak!");
            double newHealth3 = e.getHealth() -getAttack();
            e.setHealth(newHealth3);
            System.out.println(e.getName() + ": " + e.getHealth() + " hp left");

            System.out.println(e.getName() + ": You are so noob shhh.. I dealt a lot of damage to you shhhh..., you are a dead snake!");
            double newHealth4 = getHealth() - e.getAttack();
            setHealth(newHealth4);
            System.out.println("Hero snake: " + getHealth() + " hp left");

        } else {
            System.out.println("You did not type m, please try again.");
        }

        System.out.println("Type m again to continue the game.");
        String choose2 = sc.nextLine();
        if (choose2.equals("m")) {

            System.out.println(e.getName() + ": Easy damage to you i will WIN shhhh..!");
            double newHealth5 = getHealth() - e.getAttack();
            setHealth(newHealth5);
            System.out.println("Hero snake has now: " + getHealth() + " hp left");

            System.out.println("Hero snake: Very good! You just dealt " + attack + " damage to an enemy snake, he is now VERY weak!");
            double newHealth6 = e.getHealth() -getAttack();
            e.setHealth(newHealth6);
            System.out.println(e.getName() + ": " + e.getHealth() + " hp left");

        } else {
            System.out.println("You did not type m, please try again.");
        }
        if (e.getHealth() == (0)) {
            System.out.println("Great job! You killed the " + e.getName() + " You will now move onto the next enemy, which is chosen randomly.");
        }




        }






        @Override
        public String toString(){
            return "Hero name: " + name + "\nHero type: " + type + "\nHero story: " + story + "\nHero age: " + age + "\nHero health: " + health + "\nHero attack: " + attack;
        }

    }


