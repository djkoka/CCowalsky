package classwork.spring.soundSystem;

import org.springframework.stereotype.Component;

/**
 * Created by CCowalsky on 11.01.2016.
 */
@Component
public class YellowSubmarine implements CD {
    @Override
    public void play() {
        System.out.println("We all live in yellow submarine");
    }
}
