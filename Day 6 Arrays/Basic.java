public class Basic {
    public static void main(String[] args) {

        // Declaration & Initialization
        int[] arr = {10, 20, 30, 40, 50};

        // Accessing Elements
        System.out.println("First element: " + arr[0]);

        // Traversing using for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Enhanced for loop
        System.out.println("\nUsing for-each:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
