public class LabTask82 {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};

        modify(arr);  // Passing entire array

        System.out.println("Array after multiplying by 3:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    // Function to modify array
    public static void modify(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 3;
        }
    }
}
