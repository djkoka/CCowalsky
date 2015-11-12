package homework.destopgame;

import homework.destopgame.interfaces.Archer;
import homework.destopgame.interfaces.Mage;
import homework.destopgame.interfaces.Warrior;

/**
 * Created by djkoka on 04.11.2015.
 */
public abstract class SquadronFactory {
    public abstract Mage createMage();
    public abstract Archer createArcher();
    public abstract Warrior createWarrior();
}
