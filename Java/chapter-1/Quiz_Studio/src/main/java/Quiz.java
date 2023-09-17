import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

// Then design the Quiz class. A quiz has a list of questions, and we should be able to:
// 1. Add questions
// 2. Run or carry out the quiz
// 3. Grade the quiz

    //class variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    // Constructor
    public Quiz() {

    }

    // Methods
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        // Loop through each question
        for (Question question : questions) {
            //Ask the user the question
            System.out.println(question.getTheQuestion());
            // Get users answer
            String usersAnswer = this.getUsersAnswer();
            // check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            // Increment numberOfQuestionsCorrect if answered correctly
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }

        // Grade the quiz
        double percentageCorrect = (this.numberOfQuestionsCorrect / this.questions.size()) * 100;
        System.out.println("User grade: " + percentageCorrect + "%");
    }

    private String getUsersAnswer() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}

