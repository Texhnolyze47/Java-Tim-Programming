package Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name,100,"Sword");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health <= 0){
            this.health = 1;    
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.health = health;
        this.weapon = weapon;
    }

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
