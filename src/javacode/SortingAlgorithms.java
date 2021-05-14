package javacode;

public class SortingAlgorithms {
    
    private SortingAlgorithms(){}

    public static void bubbleSortBasic(int[] inputArray) {
        for(int  loopIndex = 0; loopIndex < inputArray.length; loopIndex++){
            for(int index  = 0; index < inputArray.length - 1; index ++) {
                if(inputArray[index]  > inputArray[index + 1]) {
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

    public static void selectionSort(int[] inputArray) {
        for(int index = 0; index < inputArray.length; index++) {
            for(int index_sec = index + 1; index_sec < inputArray.length; index_sec++) {
                if(inputArray[index] > inputArray[index_sec]) {
                    int          temp     = inputArray[index];
                    inputArray[index]     = inputArray[index_sec];
                    inputArray[index_sec] = temp;
                }
            }
        }
    }

    public static void selectionSortRecursive(int elementToLoop, int[] inputArray) {
        if(elementToLoop == 0) {
            return;
        }
        for(int index = elementToLoop - 1; index >= 0; index--) {
            if (inputArray[elementToLoop] < inputArray[index]) {
                int                  temp = inputArray[elementToLoop];
                inputArray[elementToLoop] = inputArray[index];
                inputArray[index]         = temp;
            }
        }
        selectionSortRecursive(elementToLoop - 1, inputArray);
    }
}
