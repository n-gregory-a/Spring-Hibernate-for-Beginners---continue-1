package gn.springdemo;

public class GoodNewsFortuneService implements FortuneService {

    @Override
    public String getFortune()  {
        return "Today gonna be great day";
    }
}
