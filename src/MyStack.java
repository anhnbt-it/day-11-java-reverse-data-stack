import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/19/2020
 * Time: 9:42 AM
 */
public class MyStack<T> {
    private LinkedList<T> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
