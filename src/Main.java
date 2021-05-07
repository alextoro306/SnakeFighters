public class Main {
    public static void main(String[] args) {
    HeroSnake hero = new HeroSnake("Sankariletku","Letku","Hän on kokenut taistelija ja voittaa kaikki vihollisensa",18,300,35);
    EnemySnake anaconda = new EnemySnake("Anaconda","Snake","Vahva kuristaja käärme joka ei pelkää mitään",27,100,5);
    EnemySnake cobra = new EnemySnake("cobra","Snake","Rauhallinen käärme, mutta kun hän suuttuu hän tuo pelkoa ympärillensä",50,125,8);
    EnemySnake python = new EnemySnake("python","Snake","Python tietää mitä haluaa eikä tullut häviämään",20,150,10);
    EnemySnake mamba = new EnemySnake("mamba","Snake","Mamba hoitelee vihollisen kuin vihollisen ja jättää vihollisestä vain jäljen jäljelle",25,200,12);
    EnemySnake kingsnake = new EnemySnake("kingsnake","Snake","Kuningas käärme on kaikkien käärmeiden kuningas, joka voitti viimeksi suuren taistelun ja on käärmeiden herra",200,500,15);
    muutos
    hero.talk(anaconda);


    }
}
