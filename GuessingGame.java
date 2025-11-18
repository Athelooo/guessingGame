public class GuessingGame {
    public static void main(String[] args) {
        int low = 0;
        int high = 10; // snabbtest, som i lärarens exempel

        Guesser g = new Guesser(low, high);
        g.start();
    }
}
