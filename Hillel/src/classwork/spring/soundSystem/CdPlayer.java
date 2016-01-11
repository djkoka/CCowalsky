package classwork.spring.soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by CCowalsky on 11.01.2016.
 */
@Scope("prototype")
@Component
public class CdPlayer {
    private CD disc;

/*    @Autowired
    public CdPlayer(CD disc) {
        this.disc = disc;
    }*/

    public void play() {
        disc.play();
    }
}
