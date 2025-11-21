import java.util.Scanner;

public class LabTask81{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] responses = new int[40]; // store 40 responses

        System.out.println("Enter 40 responses (1-10):");

        for (int i = 0; i < responses.length; i++) {
            responses[i] = readResponse(sc);
        }

        summarizeRatings(responses);
        sc.close();
    }

    // Safely read a number between 1-10
    public static int readResponse(Scanner sc) {
        int value;
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter an integer between 1 and 10:");
                sc.next(); // discard invalid input
                continue;
            }

            value = sc.nextInt();

            if (value >= 1 && value <= 10) {
                break; // valid input
            } else {
                System.out.println("Number must be between 1 and 10. Try again:");
            }
        }
        return value;
    }

    // Summarize the ratings
    public static void summarizeRatings(int[] arr) {
        int[] freq = new int[11]; // 1-10

        for (int n : arr) {
            freq[n]++;
        }

        System.out.println("\nSummary of Ratings:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Rating " + i + ": " + freq[i] + " times");
        }
    }
}
