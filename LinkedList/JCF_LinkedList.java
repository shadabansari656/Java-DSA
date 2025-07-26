// Linked List using (Java Collection FrameWork)

package JavaDSA.LinkedList;
import java.util.LinkedList;

public class JCF_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
