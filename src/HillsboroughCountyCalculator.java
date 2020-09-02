public class HillsboroughCountyCalculator extends FlKindergartenCalculator{
    public boolean isStudentAtRisk(Score score) {
        return score.getAlphabetScore() < 60;
    }

    public boolean calculatesPassingOrFailure(Score score) {
//        score.setMathScore(200);
        System.out.println("Hillsborough");
        return super.calculatesPassingOrFailure(score) && score.getAlphabetScore() > 50;
    }
}
