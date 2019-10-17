package gn.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create array of strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Dilidence is the mother of good luck",
            "The journey is the reward"
    };

    // create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = random.nextInt(data.length);

        return data[index];
    }
}
