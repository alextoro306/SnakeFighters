public class HeroSnake {
    private String name,type,story;
    private int age;
    private double health,attack;
    EnemySnake e;

    public HeroSnake(String n,String t,String s,int a,double h,double att){
        this.name = n;
        this.type = t;
        this.story = s;
        this.age = a;
        this.health = h;
        this.attack = att;
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
    public void talk(EnemySnake e){
        System.out.println("Hello " + e.getName());
    }
    public void inspect(EnemySnake e){
        System.out.println(e.toString());
    }


}