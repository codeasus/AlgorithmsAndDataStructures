package javacode;

public class SortingAlgorithms {
    
    private SortingAlgorithms(){}

    public static void bubbleSortBasic(int[] inputArray) {
        for(int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if(inputArray[i] > inputArray[j]) {
                    int tempValue = inputArray[j];
                    inputArray[j] = inputArray[i];
                    inputArray[i] = tempValue;
                }
            }
        }
    }
}
