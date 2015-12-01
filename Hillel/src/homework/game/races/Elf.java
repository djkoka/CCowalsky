package homework.game.races;

import homework.game.weapons.Damage;
import homework.game.weapons.Weapons;

/**
 * Created by djkoka on 01.12.2015.
 */
public class Elf extends Player {
    public final Damage bonusRace = new Damage(0,0,4);

    public Elf() {
        this.race = "Elf";
    }

    public Elf(Weapons weapons) {
        this.race = "Elf";
        this.weapons = weapons;
        weapons.setDamageBonus(bonusRace);
    }
}
