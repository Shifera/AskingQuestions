import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numb1 = 10;
        int numb2 = 5;
        double average = (numb1 + numb2)/2.0;

        System.out.print("Enter two numbers you'd like to be averaged");
        numb1 = keyboard.nextInt();

        System.out.print("Second temperature? ");
        numb2 = keyboard.nextInt();
               System.out.println("The avarage value is" + average);
       }
}
