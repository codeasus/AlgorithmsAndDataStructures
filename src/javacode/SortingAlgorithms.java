package javacode;

public class SortingAlgorithms {
    
    private SortingAlgorithms(){}

    public static void bubbleSortBasic(int[] inputArray) {
        for(int  loopIndex = 0; loopIndex < inputArray.length; loopIndex++){
            for(int index = 0; index < inputArray.length - 1; index ++) {
                if(inputArray[index] > inputArray[index + 1]) {
                    int tempVariable      = inputArray[index];
                    inputArray[index]     = inputArray[index + 1];
                    inputArray[index + 1] = tempVariable;
                }
            }
        }
    }

    public static void bubbleSort(int[] inputArray) {
        boolean sorted    = false;

        while(!sorted) {
            sorted        = true;
            for(int index = 0; index < inputArray.length - 1; index++) {
                if(inputArray[index] > inputArray[index + 1]) {
                    int tempVariable      = inputArray[index];
                    inputArray[index]     = inputArray[index + 1];
                    inputArray[index + 1] = tempVariable;
                    sorted                = false;
                }
            }
        }
    }

    public static void selectionSortBasic(int[] inputArray) {
        
    }

    public static void selectionSortRecursive(int elementToLoop, int[] inputArray) {};
}
