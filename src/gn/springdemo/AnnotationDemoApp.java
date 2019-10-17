package gn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        //Coach skiCoach = context.getBean("skiCoach", Coach.class);

        // call a method on the bean
        System.out.println("Tennis coach says: " + tennisCoach.getDailyWorkout());
        //System.out.println("And ski coach says: " + skiCoach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(tennisCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
