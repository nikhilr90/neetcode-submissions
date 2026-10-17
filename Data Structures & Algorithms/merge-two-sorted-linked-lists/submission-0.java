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
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode finalListHead = new ListNode(0);
       ListNode prevNode =  finalListHead;

       while(list1!= null && list2 != null){
            if(list1.val < list2.val){
                prevNode.next = list1;
                list1= list1.next;
            }else{
                prevNode.next = list2;
                list2= list2.next;
            }
            prevNode = prevNode.next;
       }
       if(list1!=null)
        prevNode.next = list1;
        if(list2!=null)
        prevNode.next = list2;

        return finalListHead.next;

}
    }