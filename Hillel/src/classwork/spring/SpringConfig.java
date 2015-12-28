package classwork.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by CCowalsky on 28.12.2015.
 */
@Configuration
public class SpringConfig {

    @Bean
    public DamselRescuingKnight knight(){
        DamselRescuingKnight knight = new DamselRescuingKnight();
        knight.setQuest(new DamselRescuingQuest());
        return knight;
    }
}
