import java.util.LinkedList;
import java.util.EmptyStackException;

/*
 A stack implementation using a LinkedList.
 @<T> the type of elements stored in the stack
 */
public class LinkedListStack<T> {
    private LinkedList<T> stack;

    /*
     Constructs a new empty LinkedListStack.
     */
    public LinkedListStack() {
        stack = new LinkedList<T>();
    }

    /*
     Adds an element to the top of the stack.
     */
    public void pushMethod(T data) {
        stack.addFirst(data);
    }

    /*
      Checks if the stack is empty.
      @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /*
     Removes and returns the top element of the stack.
     @throws EmptyStackException if the stack is empty
     */
    public void popMethod() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        stack.removeFirst();
    }

    /*
     Returns the top element of the stack without removing it.
     @throws EmptyStackException if the stack is empty
     @return the top element of the stack
     */
    public T peekMethod() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    /*
     @return the number of elements in the stack
     */
    public int getSize() {
        return stack.size();
    }
}
