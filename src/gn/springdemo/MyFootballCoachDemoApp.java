package gn.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileNotFoundException;

public class MyFootballCoachDemoApp {

    public static void main(String[] args) throws FileNotFoundException {
        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        // get the bean from spring container
        Coach coach = context.getBean("footballCoach", Coach.class);

        // call a method on the bean
        System.out.println("Football coach says: " + coach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }
}
