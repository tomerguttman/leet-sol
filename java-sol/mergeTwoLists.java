     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2)
        {
            if (l1 == null) { return l2; }
            if (l2 == null) { return l1; }
            ListNode dummyHead = new ListNode(-1, null);
            ListNode temp = dummyHead;

            while (l1 != null && l2 != null) {
                if(l1.val < l2.val) {
                    temp.next = new ListNode(l1.val,null);
                    l1 = l1.next;
                }
                else {
                    temp.next = new ListNode(l2.val,null);
                    l2 = l2.next;
                }

                temp = temp.next;
            }

            if(l1 == null) { temp.next = l2; }
            if(l2 == null) { temp.next = l1; }

            return dummyHead.next;
        }