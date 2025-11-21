public class LabTask83 {
    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};
        int[] reverse = new int[original.length];

        int index = 0;
        for (int i = original.length - 1; i >= 0; i--) {
            reverse[index] = original[i];
            index++;
        }

        System.out.println("Original Array:");
        for (int n : original) {
            System.out.print(n + " ");
        }

        System.out.println("\nReversed Array:");
        for (int n : reverse) {
            System.out.print(n + " ");
        }
    }
}
