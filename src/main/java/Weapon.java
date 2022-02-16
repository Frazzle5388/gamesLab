public abstract class Weapon {
    private String name;
    private double damagePoints;

    public Weapon(String name, double damagePoints) {
        this.name = name;
        this.damagePoints = damagePoints;
    }

    public String getName() {
        return name;
    }

    public double getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(double damagePoints) {
        this.damagePoints = damagePoints;
    }
}
