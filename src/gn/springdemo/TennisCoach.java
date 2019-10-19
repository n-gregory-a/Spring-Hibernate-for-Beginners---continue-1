package gn.springdemo;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    // define my init method
    @PostConstruct
    public void doMyStartUpStuff() {

        System.out.println(">> TennisCoach: doMyStartUpStuff()");

    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println(">> TennisCoach: doMyCleanUpStuff()");
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
