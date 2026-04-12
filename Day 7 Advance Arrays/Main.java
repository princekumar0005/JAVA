class Main {

public static void main(String[] args) {  

    // 2D Array  
    int[][] matrix = {  
        {1, 2},  
        {3, 4}  
    };  

    System.out.println("2D Array:");  
    for (int i = 0; i < matrix.length; i++) {  
        for (int j = 0; j < matrix[i].length; j++) {  
            System.out.print(matrix[i][j] + " ");  
        }  
        System.out.println();  
    }  

    // Jagged Array  
    int[][] jagged = new int[2][];  
    jagged[0] = new int[]{1, 2, 3};  
    jagged[1] = new int[]{4, 5};  

    System.out.println("\nJagged Array:");  
    for (int i = 0; i < jagged.length; i++) {  
        for (int j = 0; j < jagged[i].length; j++) {  
            System.out.print(jagged[i][j] + " ");  
        }  
        System.out.println();  
    }  

    // Passing array  
    int[] arr = {10, 20, 30};  
    printArray(arr);  

    // Returning array  
    int[] newArr = createArray();  
    System.out.println("Returned Array:");  
    for (int num : newArr) {  
        System.out.print(num + " ");  
    }  
}  

static void printArray(int[] arr) {  
    System.out.println("\nArray from method:");  
    for (int num : arr) {  
        System.out.print(num + " ");  
    }  
}  

static int[] createArray() {  
    return new int[]{100, 200, 300};  
}

}

Create a linkedin post on the based on codes
Day 7
