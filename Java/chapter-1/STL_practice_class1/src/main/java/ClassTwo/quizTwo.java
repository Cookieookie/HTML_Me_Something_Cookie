import java.util.Scanner;

// From class 2 - 8/18/2023
public class quizTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        quizTwo.addQuestion("")
        String answer = input.nextLine();

        if(answer.equals("F")) { // (if answer == "F") will not work here
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }

        System.out.println("You said: " + answer);
    }
}
