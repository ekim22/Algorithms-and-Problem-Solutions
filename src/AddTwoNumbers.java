import java.util.LinkedList;
import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807
 */
public class AddTwoNumbers {
    /**
     * My solution.
     * @param l1
     * @param l2
     * @return
     */
    public static LinkedList<Integer> getSumAsList(LinkedList<Integer> l1,
                                                   LinkedList<Integer> l2) {
        int total = 0;
        LinkedList<Integer> listOfSum = new LinkedList<>();

        if (l1.size() == l2.size()) {
            int limit = l1.size();
            for (int i = 0; i < limit; i++) {
                total += l1.pop() * Math.pow(10, i) +
                        l2.pop() * Math.pow(10, i);
            }
            System.out.println(total);
            listOfSum.add(total);
            return listOfSum;
        } else if (l1.size() > l2.size()) {
            return getIntegers(l2, l1, total, listOfSum);
        }
        else {
            return getIntegers(l1, l2, total, listOfSum);
        }
    }

    private static LinkedList<Integer> getIntegers(LinkedList<Integer> l1, LinkedList<Integer> l2, int total, LinkedList<Integer> listOfSum) {
        int limit = l2.size();
        for (int i = 0; i < limit; i++) {
            total += l2.pop() * Math.pow(10, i);
            if (!l1.isEmpty()) {
                total += l1.pop() * Math.pow(10, i);
            }
        }
        System.out.println(total);
        listOfSum.add(total);
        return listOfSum;
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l1.add(7);
        l1.add(4);

        l2.add(5);
        l2.add(6);
        l2.add(4);
        getSumAsList(l1, l2);
    }

}
