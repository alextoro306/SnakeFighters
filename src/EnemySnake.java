import java.util.Random;
public class EnemySnake {
    private Random r = new Random();
    private String name,type,story;
    private int age;
    private double health;

    //Tässä on annettu namelle ja typelle omat kirjain tunnukset jolla ne tunnistetaan
    public EnemySnake(String n, String t, String s, int a, double h){
        this.name = n;
        this.type = t;
        this.story = s;
        this.age = a;
        this.health = h;
    }
    //Tässä on get ja set metodit jotka hakee tiedot esim nimen ja iän
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
    //Tässä getataan vihollisen health
    public double getHealth() {
        return health;
    }
    //Tässä annetaan vihollisen health
    public void setHealth(double health) {
        this.health = health;
        if (this.health < 0){
            this.health = 0;
        }
    }
    //Tässä on annettu vihollisen attack arvo eli 30damagea + 1-24 väliltä randomilla lisä damagea
    public double getAttack() {
        int attack = r.nextInt();
        if (attack < 0){
            attack = -attack;
        }
        return 30 + (attack % 24);
    }
    //Tässä on override metodi jossa luodaan lista niin sanotusti ja siinä kerrotaan vihollisen statsit eli enemy name + name eli käärmeen nimi esimerkiksi
    @Override
    public String toString(){
        return "Enemy name: " + name+"\nEnemy type: " + type+"\nEnemy story: " + story+"\nEnemy age: " + age+"\nEnemy health: " + health;
    }

}



