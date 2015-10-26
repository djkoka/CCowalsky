package classwork.patterns.ducks;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public class Decoy extends Duck {

    @Override
    public String display() {
        return "Decoy";
    }

    @Override
    public String fly() {
        return "fly no way";
    }

}
