package main;
public class CheckboxQuestion extends Question {

    // Class Variables

    // Constructors
    public CheckboxQuestion(String question, String answer) {
        super(question, answer);
    }

    // Method
    public boolean checkAnswer(String answer) {
        // answer = "A, B, C" or answer = "a, b, c"
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

}