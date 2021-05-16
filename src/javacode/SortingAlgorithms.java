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

    public static void quickSort(int[] array, int leftPointer, int rightPointer) {
        if(leftPointer < rightPointer) {
            int pivot = quickSort_partition(array, leftPointer, rightPointer);

            quickSort(array, leftPointer, pivot - 1);
            quickSort(array, pivot + 1, rightPointer);
        }
    }

    private static int quickSort_partition(int[] array, int leftPointer, int rightPointer) {
        int pivotIndex     =  rightPointer;
        int elementPointer = (leftPointer - 1);
        
        for(int index = leftPointer; index < rightPointer; index++) {
            if(array[index] <= array[pivotIndex]) {
                elementPointer++;

                int tempValue          = array[elementPointer];
                array[elementPointer]  = array[index];
                array[index]           = tempValue;
            }
        }

        int temp                  = array[elementPointer + 1];
        array[elementPointer + 1] = array[rightPointer];
        array[rightPointer]       = temp;

        return (elementPointer + 1);
    }

    //  [9, 4, 12, 304, 12, 5, 102, 130, 1]
    //  [0]  ==> [9, 4, 5, 1] : [12, 12, 304, 102, 130]
    //  [1L] ==> [9, 4, 5, 1] > [4, 1] : [5, 9] > [1] : [4] : [5] : [9]
    //  [1R] ==> [12, 12, 304, 102, 130] > [12, 12, 102, 130], [304] > [12, 12, 102] : [130] > [] : [12, 12, 102]

    public static void quickSort_basic(int[] array) {
        
        int pivot         = (int) (array.length / 2);
        int leftPointer   = 0;
        int rightPointer  = array.length - 1;
        
        int tracer        = 0;
        
        for(int index = 0; index < array.length; index++) {
            if(array[tracer] < array[pivot]) {
                tracer++;
                
                
                
            }
        }
        

    }
}
