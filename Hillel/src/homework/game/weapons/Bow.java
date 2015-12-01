package homework.game.weapons;

/**
 * Created by djkoka on 01.12.2015.
 */
public class Bow extends Weapons {
    private Damage bowDamage = new Damage(0, 0, 5);

    public Bow() {
        damage.setDamageBonus(bowDamage);
    }

    @Override
    public String attack() {
        return damage.getDamage() + " " + "piercing";
    }

    @Override
    public String toString() {
        return "Bow";
    }
}
