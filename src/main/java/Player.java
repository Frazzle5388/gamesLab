import java.util.ArrayList;

public abstract class Player implements IAttack, IDefend{
    private String name;
    private double health;
    ArrayList<Weapon> weapons;
    Weapon currentWeapon;

    public Player(String name, double health, Weapon currentWeapon, ArrayList<Weapon> weapons) {
        this.name = name;
        this.health = health;
        this.weapons = weapons;
        this.currentWeapon = currentWeapon;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }


    public void setHealth(double health) {
        this.health = health;
    }

    public void switchCurrentWeapon(int index){
        this.currentWeapon = this.weapons.get(index);
    }

    public void causeDamage(Weapon weapon, Player player){
        double healthPoints = player.getHealth();
        healthPoints -= weapon.getDamagePoints();
        player.setHealth(healthPoints);
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public void heal(Weapon weapon){
        double health = this.getHealth();
        health += weapon.getDamagePoints();
        this.setHealth(health);
    }

    public void reduceAttackdamage(Player player){
        Weapon getWeapon = player.getCurrentWeapon();
        double damagePoints = getWeapon.getDamagePoints();
        damagePoints = damagePoints / 2.00;
        getWeapon.setDamagePoints(damagePoints);
        player.setCurrentWeapon(getWeapon);
    }
}
