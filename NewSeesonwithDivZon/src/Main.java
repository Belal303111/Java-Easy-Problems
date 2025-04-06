import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ListNode head=null;
        Solution node=new Solution();
        for(int i=0;i<5;i++){
            int x=s.nextInt();
          head = node.AddNode(head,x);
        }
        node.displayNode(head);
        System.out.print("Enter the element that you want to delete it: ");
        int y=s.nextInt();
        node.removeElements(head,y);
        node.displayNode(head);
    }
}

 // Definition for singly-linked list.
   class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
 
class Solution {
   /* public ListNode removeElements(ListNode head, int val) {
      while (head!=null && head.val==val)
      {
          head=head.next;
      }
        if(head==null) return null;
      // if(head.next.val==val) head.next=head.next.next;
        ListNode run=head;
        while(run.next!=null)
        {
            if(run.next.val ==val) {
                run.next=run.next.next;
            }
            else {
                run = run.next;
            }
        }
        return head;
    } */
    public ListNode removeElements(ListNode head, int val) {
        // ✅ حذف جميع القيم المتكررة في بداية القائمة
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) return null; // ✅ إذا أصبحت القائمة فارغة بعد الحذف

        ListNode run = head;
        while (run!=null && run.next != null) {
            if (run.next.val == val) {
                run.next = run.next.next; // ✅ حذف العقدة بتحديث الربط
            } else {
                run = run.next;
            }
        }
        return head;
    }

    public void displayNode(ListNode head)
    {
        ListNode run=head;
        while(run!=null)
        {
            System.out.println(run.val);
            run=run.next;
        }
    }
    public ListNode AddNode(ListNode head ,int val)
    {
        ListNode p=new ListNode(val,null);
        if(head==null) return p;
        //else if(head.next==null) head.next=p;
        else{
            ListNode run=head;
            while(run.next!=null)
            run =run.next;
            run.next=p;
            return head;
          //  System.out.println(run.val);
        }
    }
}