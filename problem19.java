/*Given the head of a linked list, remove the nth node from the end of the list and return its head.*/
public class problem19 {
     class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode reomveNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0,head);
        ListNode first = dummy;
        ListNode second = dummy;

        for(int i =0;i<=n;i++){
            first= first.next;
        }
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
  public static void main(String[] args) {
    

    problem19 solution = new problem19();
    ListNode head = solution.new ListNode(1, 
                        solution.new ListNode(2, 
                        solution.new ListNode(3, 
                        solution.new ListNode(4, 
                        solution.new ListNode(5)))));
    int n = 2;
    ListNode result = solution.reomveNthFromEnd(head, n);
    
    // Print the modified list
    while (result != null) {
        System.out.print(result.val + " ");
        result = result.next;
    }
    // Output: 1 2 3 5
  }  
}