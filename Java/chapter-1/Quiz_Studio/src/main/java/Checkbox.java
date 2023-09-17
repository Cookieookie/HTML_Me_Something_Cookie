public class Checkbox extends Question {


    // Class variables

    // Constructors
    public Checkbox (String question, String answer) {
        super(question, answer);
    }

    //Method
    @Override
    public boolean checkAnswer(String answer) {
        // answer = "A, B, C"
        // answer = "a, b, c"

        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }

    }

}
