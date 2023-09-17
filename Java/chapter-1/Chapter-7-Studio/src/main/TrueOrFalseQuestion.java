package main;

public class TrueOrFalseQuestion extends Question {
    // Class Variables

    // Constructors
    public TrueOrFalseQuestion(String question, String answer) {
        super(question, answer);
    }

    // Method
    public boolean checkAnswer(String answer) {
        // answer = "true" "false"  or "TRUE" or "FALSE"
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}