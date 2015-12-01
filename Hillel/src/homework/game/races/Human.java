package homework.game.races;

import homework.game.weapons.Damage;
import homework.game.weapons.Weapons;

/**
 * Created by djkoka on 01.12.2015.
 */
public class Human extends Player{
    public final Damage bonusRace = new Damage(3,0,0);

    public Human() {
        this.race = "Human";
    }

    public Human(Weapons weapons) {
        this.race = "Human";
        this.weapons = weapons;
        weapons.setDamageBonus(bonusRace);
    }
}
