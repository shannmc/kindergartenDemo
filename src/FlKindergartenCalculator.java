public class FlKindergartenCalculator extends KindergartenCalculator{

    @Override
    public boolean calculatesPassingOrFailure(Score score) {
        System.out.println("Florida");
        return score.getReadingScore() > 60 && score.getMathScore() > 60;
    }
}
