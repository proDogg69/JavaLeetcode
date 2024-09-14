//Nice code by bhavya_harshita from Leetcode

package easymode;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode list1 = node1;

        ListNode n3 = new ListNode(4);
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode list2 = n1;

        ListNode result = new ListNode();
        ListNode current = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = (list1 != null) ? list1 : list2;
        while (result.next != null) {
            result = result.next;
            System.out.print(result.val + " ");

        }
    }
}
