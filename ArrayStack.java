// ravi patel
// assignment 6
public class ArrayStack<T> implements Stack<T> {
    
    private T[] arr;
    private int head = -1;
    
    public ArrayStack() {
        Object[] tempArr = new Object[10];
        arr = (T[]) tempArr;
    }
    
    // this will grow the array with twice the size
    private void growArray() {
        Object[] tempArr = new Object[arr.length * 2];
        T[] nameArr = (T[]) tempArr;
        for (int i = 0; i < arr.length; i++) {
            nameArr[i] = arr[i];
        }
        arr = nameArr;
    }
    
    // add an item with of T type to the array
    @Override
    public void push(T item) {
        if (head == arr.length - 1) {
            growArray();
        }
        arr[++head] = item;
    }
    
    // we want to take a look at what Object T is being stored at the top or head of the stack
    @Override
    public T peek() {
        if (empty()) {
            return null;
        }
        return arr[head];
    }
    
    
    // we want to take out what is on top of the stack and return
    @Override
    public T pop() {
        if (empty()) {
            return null;
        }
        return arr[head--];
    }
    
    
    // this will check whether the array is filled/not filled, empty
    @Override
    public boolean empty() {
        return head == -1;
    }
}
