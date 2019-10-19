package gn.springdemo;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FromFileFortuneService implements FortuneService {

    private String fileName = "fortunes.txt";
    private List <String> fortunes;
    private Random random = new Random();

    public FromFileFortuneService() {
        File file = new File(fileName);

        System.out.println("Reading fortunes from file: " + file);
        System.out.println("File exists: " + file.exists());

        fortunes = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String tempLine;

            while ((tempLine = bufferedReader.readLine()) != null) {
                fortunes.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getFortune(){

        int i = random.nextInt(fortunes.size());

        return fortunes.get(i);
    }
}
