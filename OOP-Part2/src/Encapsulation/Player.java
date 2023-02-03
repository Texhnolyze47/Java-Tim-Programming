package Encapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHeath (int damage) {

        health = health - damage;
        if (health <= 0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoresHealth(int extraHealth){
        health = health + extraHealth;

        if (health > 100){
            System.out.println("Player restores 100%");
            health = 100;
        }
    }
}
