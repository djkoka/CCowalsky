package classwork.patterns.ducks;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public abstract class Duck {
    public String quack() {
        return "quack";
    }

    abstract public String display();
    public String fly(){
        return "I`m flying!";
    }
    public String swim(){
        return "I`m swim";
    }
}
