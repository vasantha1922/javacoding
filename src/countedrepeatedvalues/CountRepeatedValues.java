package countedrepeatedvalues;

public class CountRepeatedValues {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 6, 5};
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        
        System.out.println("Number of repeated values: " + count);
    }
}


