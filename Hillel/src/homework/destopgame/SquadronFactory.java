package homework.destopgame;

import homework.destopgame.interfaces.Bow;
import homework.destopgame.interfaces.Sword;
import homework.destopgame.interfaces.Hammer;

/**
 * Created by djkoka on 04.11.2015.
 */
public abstract class SquadronFactory {
    public abstract Sword createSword();
    public abstract Bow createBow();
    public abstract Hammer createHammer();
}
