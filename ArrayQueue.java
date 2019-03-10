// ravi patel
// assignment 6

public class ArrayQueue<T> implements Queue<T> {
    
    private int head = 0;
    private int tail = 0;
    private T[] arr;
    
    public ArrayQueue() {
        Object[] tempArr = new Object[10];
        arr = (T[]) tempArr;
    }
    
    // this method will add Object T to the end of the queue
    @Override
    public void enqueue(T item) {
        if (tail == arr.length) {
            growArray();
        }
        arr[tail++] = item;
    }
    
   // get head of queue
    // return the head of the queue
    @Override
    public T dequeue() {
        if (empty()) {
            return null;
        }
        return arr[head++];
    }
    
    // checks to see if array is taken (filled)
    @Override
    public boolean empty() {
        return head == tail;
    }
    
    // we want to increase the size of array by using amortization
    private void growArray() {
        Object[] tempArr = new Object[arr.length * 2];
        T[] nameArr = (T[]) tempArr;
        for (int i = 0; i < arr.length; i++) {
            nameArr[i] = arr[i];
        }
        arr = nameArr;
    }
    
    
}
