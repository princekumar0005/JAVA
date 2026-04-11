class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Traversing
        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("\nSum = " + sum);

        // Max & Min
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        // Reverse
        System.out.println("Reversed:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // Linear Search
        int key = 30;
        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }
        System.out.println("\nSearch 30: " + (found ? "Found" : "Not Found"));

        // Bubble Sort
        int[] arr2 = {5, 3, 8, 1, 2};
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
