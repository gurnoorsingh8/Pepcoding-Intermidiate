    public static LinkedList mergeSort(Node head, Node tail){
      // write your code here
      if(head == tail)
      {
          LinkedList  base = new LinkedList();
          base.addLast(head.data);
          return base;
      }
      
      Node mid = midNode(head);
      Node head1 = head;
      Node tail1 = mid;
      Node head2 = mid.next;
      Node tail2 = tail;
      
      mid.next = null;
      
      LinkedList first = mergeSort(head1, tail1);
      LinkedList second = mergeSort(head2, tail2);
      
      mid.next = head2;
      
      return mergeTwoSortedLists(first, second);
    }

    // Incomplete     have to make function to find mid
