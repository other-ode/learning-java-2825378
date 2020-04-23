import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String question = "What is the capital of Ghana?";
        String choiceOne = "Freetown";
        String choiceTwo = "London";
        String choiceThree = "Accra";

        //String correctAnswer = choiceThree;

        System.out.println(question);
        System.out.println("a. " + choiceOne + "\n" + "b. " + choiceTwo + "\n" + "c. " + choiceThree);

        String userAnswer = input.next();

        if (userAnswer.equals("c")){
            System.out.println("Correct answer!");
        }else{
            System.out.println("Wrong answer! The correct answer is " + choiceThree);
        }
    }
}
