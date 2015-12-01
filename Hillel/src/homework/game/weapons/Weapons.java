package homework.game.weapons;

/**
 * Created by djkoka on 01.12.2015.
 */
public abstract class Weapons {
    Damage damage = new Damage(0, 0, 0);

    public String attack() {
        return "";
    }

    public void setDamageBonus(Damage bonus) {
        this.damage.setDamageBonus(bonus);
    }
}
