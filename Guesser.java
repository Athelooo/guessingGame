import java.util.Scanner;

public class Guesser {
    private int low;
    private int high;

    // Task 1: Constructor
    public Guesser(int low, int high) {
        this.low = low;
        this.high = high;
    }

    // Task 2: start()
    public void start() {
        rules();
        doGuesses();
    }

    private void rules() {
        System.out.println("Think of a number between " +
                           low + " and " + high);
        System.out.println("I'm going to ask a few questions in order to guess the number.");
        System.out.println("Please answer T for true, and F for false.\n");
    }

    // Task 3: getReply()
    private String getReply() {
        Scanner sc = new Scanner(System.in);
        String reply = sc.nextLine().trim().toUpperCase();

        while (!reply.equals("T") && !reply.equals("F")) {
            System.out.println("Please answer T for true or F for false.");
            reply = sc.nextLine().trim().toUpperCase();
        }

        return reply;
    }

    private void doGuesses() {
        int guesses = 0; 
        int middle = 0;

        while (low < high) {
            middle = low + (high - low) / 2;

            System.out.println("Is the number less than or equal to " + middle + "?");
            String reply = getReply();

            if (reply.equals("T")) {
                high = middle;
            } else {
                low = middle + 1;
            }

            guesses++;
        }

        answer(low, guesses);
    }

    private void answer(int guess, int numberOfGuesses) {
        System.out.println("You were thinking about " +
                           guess +
                           " (took me " + numberOfGuesses +
                           " guesses)");
    }
}
