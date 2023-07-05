package com.devmountain.unit5;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListSum {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Create linked lists representing numbers
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(1);

        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(4);

        // Call the function to add the numbers
        ListNode result = addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: 9 7 5
    }
}

