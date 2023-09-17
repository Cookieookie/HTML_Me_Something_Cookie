
// Base Class
public abstract class Question {
    private String theAnswer;
    private String theQuestion;


    //Constuctors
    public Question(String question, String answer) {
        this.theAnswer = theAnswer;
        this.theQuestion = theQuestion;
    }

    //Methods
    // Getters
    public String getTheQuestion() {
        return this.theQuestion;
    }

    public String getTheAnswer() {
        return this.theAnswer;
    }

    // Methods
    public abstract boolean checkAnswer(String answer);



}
