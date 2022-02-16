import java.util.ArrayList;

public abstract class Player implements IAttack {
    private String name;
    private int health;
    ArrayList<Weapon> weapons;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(Weapon weapon){
        this.health-=weapon.getDamagePoints();

    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void causeDamage(Weapon weapon, Player player){
        int healthPoints = player.getHealth();
        healthPoints -= weapon.getDamagePoints();
        player.setHealth(healthPoints);
    }

    public void heal(Weapon weapon){
        int health = this.getHealth();
        health += weapon.getDamagePoints();
        this.setHealth(health);
    }
}
