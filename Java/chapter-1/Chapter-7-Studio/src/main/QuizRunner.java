package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultiChoiceQuestion = new MultipleChoiceQuestion("What sound does a dog make?" +
                "\nA: Bark\nB: Quack\nPlease just type a single letter as an answer", "A");
        myQuiz.addQuestion(myMultiChoiceQuestion);

        CheckboxQuestion myCheckboxQuestion = new CheckboxQuestion("Select all that apply, which animals can fly?\nA: Penguins\nB: Doves\nC: Owls", "B, C");
        myQuiz.addQuestion(myCheckboxQuestion);

        TrueOrFalseQuestion myTrueOrFalseQuestion = new TrueOrFalseQuestion("Dogs are omnnivores?  \n True or False?", "True");
        myQuiz.addQuestion(myTrueOrFalseQuestion);

        myQuiz.runQuiz();
    }
}