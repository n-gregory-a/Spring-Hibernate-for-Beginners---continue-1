package gn.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    // define bean for sad fortune service
    @Bean
    public FortuneService goodNewsFortuneService() {
        return new GoodNewsFortuneService();
    };

    //define bean for football coach AND inject dependency
    @Bean
    public Coach footballCoach () {
        return new FootballCoach(goodNewsFortuneService());
    }
}
