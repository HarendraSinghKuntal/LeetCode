
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
        return head;
        int n = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }
        k = k%n;
        if(k == 0)
        return head;
        temp.next = head;
        for(int i = 0; i<n -k;i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}