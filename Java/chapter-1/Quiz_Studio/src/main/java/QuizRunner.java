public class QuizRunner {
    public static void main (String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoice myMultipleChoiceQuestion = new MultipleChoice("What sound does a dog make?\nA: Bark \n B: Meow\n C: Tweet\n Please just type a single letter as an answer", "A");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        Checkbox myCheckBoxQuestion = new Checkbox ("Select all that apply, which animals can fly? \n A: Penguins \n B:Pigeons \n C: Owls","B, C");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueOrFalse myTrueOrFalseQuestion = new TrueOrFalse("Dogs are onmivores?\n True or False?", "True");
        myQuiz.addQuestion(myTrueOrFalseQuestion);

        myQuiz.runQuiz();

    }
}

