package adventureGame;

public class User {

    private int health;

    private Attack currentAttack;

    void useWeapon() {
        System.out.println("User has attacked with this weapon and it has " + this.getCurrentAttack().getDamage() + " damage.");
    }

    public Attack getCurrentAttack() {
        return currentAttack;
    }

    public void setCurrentAttack(Attack currentAttack) {
        this.currentAttack = currentAttack;
    }
}


