package homework.game.races;

import homework.game.weapons.Weapons;

/**
 * Created by djkoka on 01.12.2015.
 */
public class Player {
    String race;
    Weapons weapons;
    int raceBonus;

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String attack() {
        return race + " attack " + weapons.attack();
    }
}
