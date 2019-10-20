package gn.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileNotFoundException;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) throws FileNotFoundException {

        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);


        // call a method on the bean
        System.out.println("Coach says: " + theCoach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
