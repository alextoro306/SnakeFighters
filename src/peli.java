import java.util.Random;
import java.util.Scanner;

public class peli {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to SnakeFighters! You are on arena 1");
        System.out.println("Type play in any form to start.");
        String Answer = sc.nextLine();
        if(Answer.toUpperCase().equals("PLAY")){
            System.out.println("Arvottu vastustajasi:");

    }else{
            System.out.println("Type play in any form to start");
        }
}
}