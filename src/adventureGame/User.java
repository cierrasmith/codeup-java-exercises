package adventureGame;

public class User {

    private int health;

    private Attack currentAttack;

    void useWeapon() {
        System.out.println("Wow, nice " + this.getCurrentAttack().getDamageType() + " attack!");
        System.out.println("You're on your way to taking down the enemy with those " + this.getCurrentAttack().getDamage() + " damage points!");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Attack getCurrentAttack() {
        return currentAttack;
    }

    public void setCurrentAttack(Attack currentAttack) {
        this.currentAttack = currentAttack;
    }
}


