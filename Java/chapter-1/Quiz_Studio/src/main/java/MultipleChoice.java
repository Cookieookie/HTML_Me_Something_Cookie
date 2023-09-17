public class MultipleChoice extends Question {

    // Class variables

    // Constructor
    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }


    // Methods
    @Override
    public boolean checkAnswer (String answer) {
        // answer = "A" or "B"

        String actualAnswer = this.getTheAnswer();
        // Case Insensitive
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

}
