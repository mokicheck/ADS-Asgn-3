import java.util.ArrayList;
import java.util.NoSuchElementException;

/*
  This class implements a queue using an ArrayList.
  @<T> the type of the elements in the queue
 */
public class ListQueue<T> {
    private ArrayList<T> queue;

    //Creates an empty queue.

    public ListQueue() {
        queue = new ArrayList<>();
    }

    //Adds an element to the back of the queue.
    //@data the element to add

    public void enqueue(T data) {
        queue.add(data);
    }

    /*
     * Checks if the queue is empty.

     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /*
      Removes and returns the front element of the queue.
      @return the front element of the queue
      @throws NoSuchElementException if the queue is empty
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }

    /*
      Returns the front element of the queue without removing it.
      @return the front element of the queue
      @throws NoSuchElementException if the queue is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    /*

      @return the number of elements in the queue
     */
    public int getSize() {
        return queue.size();
    }
}
