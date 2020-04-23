import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fortune teller
        int inputtedNumber;

        System.out.println("Pick a number between 1 and 10 ");

        Scanner input = new Scanner(System.in);
        inputtedNumber = input.nextInt();

        if (inputtedNumber < 5){
            System.out.println("Enjoy the good fortune a friend brings you");
        }else {
            System.out.println("Your shoe selection will make you happy today");
        }

        //While loop

        Scanner secondInput = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat){
            System.out.println("Playing current song!");
            System.out.println("Do you want to move to next song? Answer yes or no");
            String userInput = input.next();

            if (userInput.equals("yes")){
                isOnRepeat = false;
            }

        }
        System.out.println("Playing next song");
    }
}
