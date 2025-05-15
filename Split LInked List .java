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
    public ListNode[] splitListToParts(ListNode head, int k) {

ListNode arr[] = new ListNode[k];
        int size =0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int each = size/k;
        int rem = size%k;
        temp =head;
        int i =0;
  
            while(i<k && temp!=null){
                arr[i++] = temp;
                    int n = each+(rem >0?1:0);
                    int count =0;
                    while( count<n-1){
                        temp = temp.next;
                        count++;
                    }
                    ListNode next = temp.next;
                   temp.next = null;
                    temp = next;
                     rem--;
            }

        return arr;
    }
}
