public abstract class Weapon {
    private String name;
    private int damagePoints;

    public Weapon(String name, int damagePoints) {
        this.name = name;
        this.damagePoints = damagePoints;
    }

    public String getName() {
        return name;
    }

    public int getDamagePoints() {
        return damagePoints;
    }




}
