package homework.game;

import homework.game.races.Elf;
import homework.game.races.Human;
import homework.game.races.Player;
import homework.game.weapons.Bow;
import homework.game.weapons.Sword;

/**
 * Created by djkoka on 01.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Elf(new Bow());
        System.out.println(player.attack());
    }
}
