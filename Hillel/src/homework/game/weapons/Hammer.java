package homework.game.weapons;

/**
 * Created by djkoka on 01.12.2015.
 */
public class Hammer extends Weapons {
    private Damage hammerDamage = new Damage(0, 7, 0);

    public Hammer() {
        damage.setDamageBonus(hammerDamage);
    }

    @Override
    public String attack() {
        return damage.getDamage() + " " + "crushing";
    }

    @Override
    public String toString() {
        return "Hammer";
    }
}
