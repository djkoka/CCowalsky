package homework.game.weapons;

/**
 * Created by djkoka on 01.12.2015.
 */
public class Sword extends Weapons {
    private Damage swordDamage = new Damage(6, 0, 0);

    public Sword() {
        damage.setDamageBonus(swordDamage);
    }

    @Override
    public String attack() {
        return damage.getDamage() + " " + "chopping";
    }

    @Override
    public String toString() {
        return "Sword";
    }
}
