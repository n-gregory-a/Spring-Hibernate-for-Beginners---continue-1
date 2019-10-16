package gn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        Coach skyCoach = context.getBean("skyCoach", Coach.class);

        // call a method on the bean
        System.out.println("Tennis coach says: " + tennisCoach.getDailyWorkout());
        System.out.println("And sky coach says: " + skyCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
