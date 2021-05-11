import java.lang.reflect.Array;
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
        EnemySnake anaconda = new EnemySnake("Anaconda", "Snake", "A strong strangler snake who fears nothing.", 27, 100, 5);
        EnemySnake cobra = new EnemySnake("cobra", "Snake", "A peaceful snake, but if you make him angry it will not be fun.", 50, 125, 8);
        EnemySnake python = new EnemySnake("python", "Snake", "Python knows what he came for, and will eliminate you.", 20, 150, 10);
        EnemySnake mamba = new EnemySnake("mamba", "Snake", "Mamba will destroy enemy after enemy, and only leaves a mark.", 25, 200, 12);
        EnemySnake kingsnake = new EnemySnake("kingsnake", "Snake", "The kingsnake is the king of all snakes and has won every fight in its lifetime.", 200, 500, 15);
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


    public void makeDecision() {
        System.out.println("How do you want to attack first?");
    }
        @Override
        public String toString(){
            return "Hero name: " + name + "\nHero type: " + type + "\nHero story: " + story + "\nHero age: " + age + "\nHero health: " + health + "\nHero attack: " + attack;
        }
    }


