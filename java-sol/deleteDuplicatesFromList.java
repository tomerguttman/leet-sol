      public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = head, prev = head, next = head;

        while (head != null)
        {
            if ( head.next != null) { 
                next = head.next; 
                if( prev.val == next.val ) { prev.next = next.next;  }
                else { prev = prev.next; head = head.next; }
            }
            else { break; }
        }

        return dummy;
      }