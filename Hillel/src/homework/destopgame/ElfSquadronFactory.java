package homework.destopgame;

import homework.destopgame.Elf.ElfArcher;
import homework.destopgame.Elf.ElfMage;
import homework.destopgame.Elf.ElfWarrion;
import homework.destopgame.interfaces.Archer;
import homework.destopgame.interfaces.Mage;
import homework.destopgame.interfaces.Warrior;

/**
 * Created by djkoka on 04.11.2015.
 */
public class ElfSquadronFactory extends SquadronFactory {



    @Override
    public Mage createMage() {
        return new ElfMage();
    }
    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }
    @Override
    public Warrior createWarrior() {
        return new ElfWarrion();
    }
}
