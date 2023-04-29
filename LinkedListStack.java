import java.util.LinkedList;
import java.util.EmptyStackException;

public class LinkedListStack<T> {
    private LinkedList<T> stack;

    public LinkedListStack()
    {
        stack = new LinkedList<T>;
    }

    public void push(T data) // This function adds an element to the bottom of the stack.
    {
        stack.addLast(data);
    }

    public boolean isEmpty() // This function checks if the stack is empty and returns true if it is.
    {
        if (stack.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void pop() // This function removes and returns the bottom element of the stack.
    {
        if (stack.isEmpty())
        {
            throw new EmptyStackException;
        }
        stack.removeLast();
    }

    public T peek() // This function returns the bottom element of the stack without removing it.
    {
        if (stack.isEmpty())
        {
            return null;
        }
        return stack.getLast();
    }

    public int size()
    {
        return stack.length;
    }
}
