public class EnemySnake {
    private String name,type,story;
    private int age;
    private double health,attack;

    public EnemySnake(String n,String t,String s,int a,double h,double att){
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
    @Override
    public String toString(){
        return "Enemy name: " + name+"\nEnemy type: " + type+"\nEnemy story: " + story+"\nEnemy story: "
    }

}



