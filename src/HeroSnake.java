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
    private double health;
    private boolean hasFled;

    //Tässä on annettu namelle ja typelle omat kirjain tunnukset jolla ne tunnistetaan
    //Tässä on myös annettu arvot enemysnakelle kuten attack ja health
    //myös enemyt on addattu listaan
        public HeroSnake(String n, String t, String s, int a, double h, ArrayList<EnemySnake> ListEnemy, boolean j) {
        this.name = n;
        this.type = t;
        this.story = s;
        this.age = a;
        this.health = h;
        this.EnemyList = ListEnemy;
        this.hasFled = j;
        EnemySnake anaconda = new EnemySnake("Anaconda", "Strangler Snake", "A strong strangler snake who fears nothing.", 5, 379);
        EnemySnake cobra = new EnemySnake("Cobra", "Poisonous Snake", "A peaceful snake, but if you make him angry it will not be fun.", 10, 402);
        EnemySnake python = new EnemySnake("Python", "Strangler Snake", "Python knows what he came for, and will strangle you.", 20, 399);
        EnemySnake mamba = new EnemySnake("Mamba", "Poisonous Snake", "Mamba will destroy enemy after enemy, and only leaves a mark.", 9, 395);
        EnemyList.add(anaconda);
        EnemyList.add(cobra);
        EnemyList.add(python);
        EnemyList.add(mamba);

    }
    //Tässä haetaan enemy listasta switch casella
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
    //Tässä on esim get set metodit jotka hakee tiedot toisesta luokasta
    public int getListSize(ArrayList EnemyList) {
        return EnemyList.size();
    }

    public int getSizeList(ArrayList RandomDamage) {
        return  RandomDamage.size();
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
    //Tässä getataan herosnaken health
    public double getHealth() {
        return health;
    }
    //Tässä annetaan herosnaken health
    public void setHealth(double health) {
        this.health = health;
        if (this.health < 0) {
            this.health = 0;
        }
    }
    //Tässä on annettu herosnaken attack arvo eli 30damagea + 1-30 väliltä randomilla lisä damagea
    public double getAttack() {
        int attack = r.nextInt();
        if (attack < 0){
            attack = -attack;
        }
        return 30 + (attack % 30);
    }
    //tässä on pako metodi jolla voi paeta tappelusta
    public boolean isHasFled() {
        return hasFled;
    }
    //tässä on pako metodi jolla voi paeta tappelusta
    public void setHasFled(boolean hasFled) {
        this.hasFled = hasFled;
    }
    //Tässä on laitettu että jos hp on isompi kuin 0 niin peli jatkuu
    public boolean checkHealth(){
        if(health > 0){
            return true;

        }else{
            return false;
        }
    }
        //Tässä on koko fight metodi eli taistelu ja siihen on lisätty siihen kuuluvat toiminnallisuudet
        //käytetty esim while looppia ja switch casea ja myös if elseä
        public int fightEnemy(EnemySnake e, boolean canUseHealth, boolean canFLeeFight){
            while(e.getHealth()>0 && getHealth()>0 && isHasFled()==false){
                System.out.println("Attack the " + e.getName() +" by typing a or flee from the battle by typing f");
                String input = sc.nextLine();
                switch (input){
                    case "a":
                        double ownAttack = getAttack();
                        double enemyAttack = e.getAttack();
                    double newHealth = e.getHealth() - ownAttack;
                    e.setHealth(newHealth);
                    double enemyHealth = getHealth() - enemyAttack;
                    setHealth(enemyHealth);
                    if (getHealth() == 0){
                        System.out.println("You died, we'll get em next time.");
                        return 0;
                    }
                    if (e.getHealth() == 0) {
                        System.out.println("The " + e.getName() + " died");
                        return 1;
                    }
                    System.out.println("You dealt " + ownAttack + " damage to " + e.getName() + "\nYou receive " + enemyAttack + " damage in return\nYour health is now at " + getHealth() + "\n" + e.getName() + "'s health is at " + e.getHealth());
                    if(canUseHealth == true && getHealth() < 50){
                        System.out.println("You are low hp! Use a health potion now!");
                        System.out.println("Type u to use a health potion");
                        String typeu = sc.nextLine();
                        if (typeu.equals("u")){
                            setHealth(439);
                            System.out.println("You drank a health potion and regained all your 439 health, go beat the boss!");
                        }else{
                            System.out.println("You might die soon because you didn't take a health potion! But you can,");
                        }
                    }
                    break;
                    case "f":
                        if(canFLeeFight){
                            System.out.println("You fled the battle like a coward");
                            setHasFled(true);
                            return 2;
                        }else{
                            System.out.println("You can't flee this fight!");
                        }
                }
            }
            return 3;
        }
        //Tässä on override metodi jossa luodaan lista niin sanotusti ja siinä kerrotaan herosnaken statsit eli hero name + name eli käärmeen nimi esimerkiksi
        @Override
        public String toString(){
            return "Hero name: " + name + "\nHero type: " + type + "\nHero story: " + story + "\nHero age: " + age + "\nHero health: " + health + "\nHero attack: ";
        }

    }


