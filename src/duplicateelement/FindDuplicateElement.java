package duplicateelement;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7, 7};
        
        System.out.println("Duplicate elements in given array: ");
        
        // loop through array elements
        for (int i = 0; i < arr.length; i++) {
            
            // check if element is already processed
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

	


