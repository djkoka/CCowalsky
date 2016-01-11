package classwork.spring;


import classwork.spring.soundSystem.CdPlayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by User on 28.12.2015.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

       // DamselRescuingKnight knight = context.getBean(DamselRescuingKnight.class);

      // knight.embarkQuest();

        context.getBean(CdPlayer.class).play();
    }
}
