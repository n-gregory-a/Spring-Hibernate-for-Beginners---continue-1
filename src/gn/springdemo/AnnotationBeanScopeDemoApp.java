package gn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if the are the same
        boolean result = (coach == alphaCoach);

        //print out the result
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for coach" + coach);
        System.out.println("\nMemory location for alphaCoach" + alphaCoach + "\n");

        //close the context
        context.close();

    }
}
