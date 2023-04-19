package MinMaxarray;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 1, 9, 4};

        // initialize min and max with the first element of the array
        int min = arr[0];
        int max = arr[0];

        // iterate over the rest of the array and update min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }
}

	


