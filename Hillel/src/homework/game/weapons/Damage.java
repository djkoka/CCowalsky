package homework.game.weapons;

import java.util.Arrays;

/**
 * Created by djkoka on 01.12.2015.
 */
public class Damage {
    private int[] damages = {0, 0, 0};

    public Damage(int crush, int chop, int pierce) {
        damages[0] = crush;
        damages[1] = chop;
        damages[2] = pierce;
    }

    public String getDamage() {
        String formatString = new String();
        int[] temp = damages.clone();
        Arrays.sort(temp);
        return formatString += temp[2] + temp[1] / 2;
    }

    public void setDamageBonus(Damage bonus) {
        damages[0] = bonus.damages[0];
        damages[1] = bonus.damages[1];
        damages[2] = bonus.damages[2];
    }
}
