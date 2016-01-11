package classwork.spring;


import classwork.spring.medieval.DamselRescuingKnight;
import classwork.spring.medieval.DamselRescuingQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by CCowalsky on 28.12.2015.
 */
@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public DamselRescuingKnight knight() {
        DamselRescuingKnight knight = new DamselRescuingKnight();
        return knight;
    }

    @Bean
    public DamselRescuingQuest quest(){
        return new DamselRescuingQuest();
    }

}