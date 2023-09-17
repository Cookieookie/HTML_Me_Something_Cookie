package main;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String question, String answer) {
        // access parent constructor
        super(question, answer);
    }

    // annotation
    @Override
    public boolean checkAnswer(String answer) {
        // answer = "A" or "B", answer = "a" or "b"
        String actualAnswer = this.getTheAnswer();
        // make check case insensitive
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}