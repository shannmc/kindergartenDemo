import java.util.Arrays;
import java.util.List;

public class KindergartenPassingApp {
    public static void main(String[] args) {
        Score score = new Score();
        score.setReadingScore(99);
        score.setMathScore(99);
        score.setAlphabetScore(80);


        List<String> nameList = Arrays.asList("bob", "bailey", "bop");
            nameList
                    .stream()
                    .filter(n -> n.startsWith("b"))
                    .map(String::toUpperCase)
                    .sorted()
                    .forEach(System.out::println);
        }



//        HillsboroughCountyCalculator hillsboroughCountyCalculator = new HillsboroughCountyCalculator();
//        System.out.println(hillsboroughCountyCalculator.calculatesPassingOrFailure(score));
//        System.out.println(score.getMathScore());


    }


