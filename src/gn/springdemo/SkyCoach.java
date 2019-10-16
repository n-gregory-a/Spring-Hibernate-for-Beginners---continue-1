package gn.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SkyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 50 km free style marathon";
    }
}
