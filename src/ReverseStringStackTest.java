/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/19/2020
 * Time: 3:42 PM
 */
public class ReverseStringStackTest {
    public static void main(String[] args) {
        MyStack<Character> charList = new MyStack<>();
        MyStack<Character> reverseCharList = new MyStack<>();
        String str = "KhoaiTay";
        for (char s : str.toCharArray()) {
            charList.push(s);
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.print("Reverse List: ");
        while (!charList.isEmpty()) {
            System.out.print(charList.peek() + " ");
            reverseCharList.push(charList.pop());
        }
    }
}
