public class TrueOrFalse extends Question {

// Class variables

    // Constructors
    public TrueOrFalse (String question, String answer) {
        super(question, answer);
    }

    //Method
    @Override
    public boolean checkAnswer(String answer) {
        // answer = "true"
        //answer = "false"

        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }

    }

}

