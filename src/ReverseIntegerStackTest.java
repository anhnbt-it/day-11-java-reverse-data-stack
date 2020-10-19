/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/19/2020
 * Time: 1:39 PM
 */
public class ReverseIntegerStackTest {
    public static void main(String[] args) {
        MyStack<Integer> listInteger = new MyStack<>();
        MyStack<Integer> reverseListInteger = new MyStack<>();
        listInteger.push(1);
        listInteger.push(5);
        listInteger.push(11);
        listInteger.push(8);
        System.out.print("size=" + listInteger.size() + ": ");
        while (!listInteger.isEmpty()) {
            System.out.print(listInteger.peek() + " ");
            reverseListInteger.push(listInteger.pop());
        }
        System.out.print("\nReverse list");
        System.out.print("\nNew list size=" + reverseListInteger.size() + ": ");
        while (!reverseListInteger.isEmpty()) {
            System.out.print(reverseListInteger.pop() + " ");
        }
    }
}
