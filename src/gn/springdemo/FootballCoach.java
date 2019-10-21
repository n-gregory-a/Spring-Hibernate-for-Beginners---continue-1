package gn.springdemo;

import java.io.FileNotFoundException;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Just play foorball, bud";
    }

    @Override
    public String getDailyFortune() throws FileNotFoundException {
        return fortuneService.getFortune();
    }
}
