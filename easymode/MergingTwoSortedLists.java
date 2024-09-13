// Not wrong but not the method meant to use

package easymode;

import java.util.LinkedList;

public class MergingTwoSortedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        int i = 0;
        int j = 0;
        LinkedList<Integer> list3 = new LinkedList<>();
        while (list1.size() + list2.size() > 0) {
            i = list1.peek();
            j = list2.peek();
            if (i < j) {
                list3.add(list1.pop());
            } else if (i > j) {
                list3.add(list2.pop());
            } else {
                list3.add(list1.pop());
                list3.add(list2.pop());
            }
        }
        System.out.println(list3);
    }
}
