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
        ListNode previous = null;
        ListNode current = head;
        
        return reverseListRecursion(previous, current);
    }
    
    public ListNode reverseListRecursion(ListNode previous, ListNode current){
        if (current == null){
            return previous;
        }
        
        ListNode temp = current.next;
        current.next = previous;
        previous = current;
        current = temp;
        return reverseListRecursion(previous, current);
    }
}