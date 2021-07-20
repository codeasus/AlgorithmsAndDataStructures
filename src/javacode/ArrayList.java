package javacode;

import java.util.Arrays;

public class ArrayList<T> {
    private Object[] internalArray   = new Object[10];
    private int      internalCounter = 0;

    public ArrayList(){};

    public ArrayList(T[] inputArray){
        this.internalArray   = inputArray;
        this.internalCounter = inputArray.length;
    }
    
    public void add(T inputValue) {
        if(internalCounter == internalArray.length) {
            internalArray = new Object[internalCounter * 2];
        } 
        this.internalArray[internalCounter] = inputValue;
        this.internalCounter++;
    }

    @SuppressWarnings("unchecked")
    public T get(Integer index){
        if(index < 0 || index >= internalCounter) {
            throw new IndexOutOfBoundsException();
        }
        return (T) this.internalArray[index];
    }

    public void insert(T inputValue, Integer index) {
        if(index < 0 || index >= internalCounter ) {
            throw new IndexOutOfBoundsException();
        }
        if(internalCounter == internalArray.length) {
            internalArray = new Object[internalCounter * 2];
        }
        for(int index_element = internalCounter; index_element > index; index_element--) {
            this.internalArray[index_element] = this.internalArray[index_element - 1];
        }
        this.internalArray[index] = inputValue;
        this.internalCounter++;
    }

    // toString() method will be modified later after the development is over!
    @Override
    public String toString() {
        return Arrays.toString(this.internalArray);
    }
}
