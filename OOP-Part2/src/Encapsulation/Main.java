package Encapsulation;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//
//        player.loseHeath(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 200;
//        player.loseHeath(11);
//        System.out.println("Remaining health = " + player.healthRemaining());
        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("Initial Health " + tim.healthRemaining());
    }
}
