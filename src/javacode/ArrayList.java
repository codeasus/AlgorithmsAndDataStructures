package javacode;

public class ArrayList<T> {
    private Object[] internalArray   = new Object[10];
    private int      internalCounter = 0;

    public void add(T inputValue) {
        if(internalCounter == internalArray.length) {
            internalArray = new Object[internalCounter * 2];
        } 
        internalArray[internalCounter] = inputValue;
        internalCounter++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T) this.internalArray[index];
    }
}
