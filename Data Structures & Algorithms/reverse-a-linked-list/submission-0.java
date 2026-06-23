class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode tempNext;
        ListNode previous = null;

        ListNode current = head;
        
        while(current.next != null){
            tempNext = current.next;
            current.next = previous;
            previous = current;
            current = tempNext;
        }
        current.next = previous;

        return current;
    }
}
