package gn.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;

@Component
public class TennisCoach implements Coach {

    @Qualifier("fromFileFortuneService")
    @Autowired
    private FortuneService fortuneService;

    //define default constructor

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
//        this.fortuneService = fortuneService;
//    }


//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() throws FileNotFoundException {
        return fortuneService.getFortune();
    }
}
