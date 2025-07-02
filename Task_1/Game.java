package Task_1;
import java.util.*;
import java.util.random.*;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, I’m Jarvis — your virtual game master.");
        System.err.println("Welcome, Challenger! 🔮 Ready to test your guessing skills?");
        System.out.println("Are you Ready(Yes/No)");
        String user_answer = sc.nextLine();
        if (user_answer.equalsIgnoreCase("Yes")) {
            System.out.println("good to go");
            System.out.println("Hmm... I’m thinking of a number between 1 and 100. Think you can guess it?");
            Random r = new Random();
            int Jarvis_number = r.nextInt(101);
            System.out.println("Alright, you’ve got 10 chances to crack the code.");
            System.out.println("I've guessed a number. Can you figure it out? Start guessing!");
            int count = 0;
            for (int i = 1; i < 11; i++) {
                System.out.println("Alright, what’s your guess? Type it in!");
                int user_number = sc.nextInt();
                count = i;
                if (user_number > 100 || user_number < 0) {
                    System.out.println("Invalid input detected: Guess must be between 1 and 100. Try again.");
                } else if (Jarvis_number == user_number) {
                    System.out.println("Yay! Nailed it — you guessed it right!");
                    System.out.println("You scored " + count + "/10! Not bad… but can you beat your own high score next time");
                    break;
                } else if (Jarvis_number > user_number) {
                    System.out.println("Your guess is too low. Try something a bit higher.");
                } else if (Jarvis_number < user_number) {
                    System.out.println("Your guess is too high. Adjust downward and try again.");
                }
            }
            System.out.println( );
            if (count == 10) {
                System.out.println("Maximum attempts reached. You were unable to guess the correct number.");
            }
        }  else{
            System.out.println("Ha  ha, scared? It's just a number, not a ghost!");
        }
    }
}

