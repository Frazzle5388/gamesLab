import java.util.ArrayList;

public abstract class Player implements IAttack {
    private String name;
    private int health;
    ArrayList<Weapon> weapons;
    Weapon currentWeapon;

    public Player(String name, int health, Weapon currentWeapon, ArrayList<Weapon> weapons) {
        this.name = name;
        this.health = health;
        this.weapons = weapons;
        this.currentWeapon = currentWeapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public void switchCurrentWeapon(int index){
        this.currentWeapon = this.weapons.get(index);
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
