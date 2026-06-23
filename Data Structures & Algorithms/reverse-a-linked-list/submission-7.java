/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode current = head;
        Deque<ListNode> s = new LinkedList<>(); 
        s.push(head);
        while(current.next != null){
            s.push(current.next);
            current = current.next;
        }

        ListNode newhead = s.pop();
        current = newhead;
        while(s.size() != 0){
            current.next = s.pop();
            current = current.next;
        }

        current.next = null;
        

        return newhead;
    }
}
