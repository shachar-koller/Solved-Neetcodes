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
        Deque<ListNode> stack = new LinkedList<>();
        stack.push(current);
        while(current.next != null){
            stack.push(current.next);
            current = current.next;
        }

        ListNode newhead = stack.pop();
        current = newhead;

        while(!stack.isEmpty()){
            current.next = stack.pop();
            current = current.next;
        }

        current.next = null;

        return newhead;
        
    }
}
