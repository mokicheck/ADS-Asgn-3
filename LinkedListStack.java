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


    public void popMethod() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        stack.removeFirst();
    }


    public T peekMethod() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }


    public int getSize() {
        return stack.size();
    }
}
