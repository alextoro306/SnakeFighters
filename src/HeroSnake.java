import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


public class HeroSnake {
    ArrayList<EnemySnake> EnemyList = new ArrayList<>();
    Random r = new Random();
    private EnemySnake e;
    private String name,type,story;
    private int age;
    private double health,attack;



    public HeroSnake(String n,String t,String s,int a,double h,double att, ArrayList<EnemySnake>ListEnemy){
        this.name = n;
        this.type = t;
        this.story = s;
        this.age = a;
        this.health = h;
        this.attack = att;
        this.EnemyList = ListEnemy;
        EnemySnake anaconda = new EnemySnake("Anaconda", "Snake", "Vahva kuristaja käärme joka ei pelkää mitään", 27, 100, 5);
        EnemySnake cobra = new EnemySnake("cobra", "Snake", "Rauhallinen käärme, mutta kun hän suuttuu hän tuo pelkoa ympärillensä", 50, 125, 8);
        EnemySnake python = new EnemySnake("python", "Snake", "Python tietää mitä haluaa eikä tullut häviämään", 20, 150, 10);
        EnemySnake mamba = new EnemySnake("mamba", "Snake", "Mamba hoitelee vihollisen kuin vihollisen ja jättää vihollisestä vain jäljen jäljelle", 25, 200, 12);
        EnemySnake kingsnake = new EnemySnake("kingsnake", "Snake", "Kuningas käärme on kaikkien käärmeiden kuningas, joka voitti viimeksi suuren taistelun ja on käärmeiden herra", 200, 500, 15);
        EnemyList.add (anaconda);
        EnemyList.add (cobra);
        EnemyList.add (python);
        EnemyList.add (mamba);
        EnemyList.add (kingsnake);

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

    public void makeDecision(){
        System.out.println("Aloitan pelin");
    }


}