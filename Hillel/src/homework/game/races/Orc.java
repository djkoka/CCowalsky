package homework.game.races;

import homework.game.weapons.Damage;
import homework.game.weapons.Weapons;

/**
 * Created by djkoka on 01.12.2015.
 */
public class Orc extends Player{
    public final Damage bonusRace = new Damage(0,2,0);

    public Orc() {
        this.race = "Orc";
    }

    public Orc(Weapons weapons) {
        this.race = "Orc";
        this.weapons = weapons;
        weapons.setDamageBonus(bonusRace);
    }
}

