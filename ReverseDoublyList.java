
public class ReverseDoublyList {
	static Node head; 
	  
    static class Node { 
  
        int data; 
        Node next, prev; 
  
        Node(int d) { 
            data = d; 
            next = prev = null; 
        } 
    }
    
    public static  void reverse() {
    	Node current =head;
    	Node temp=null;
    	while(current!=null) {
    	temp=current.prev	;
    	current.prev=current.next;
    	current.next=temp;
    	current=current.prev;
    	}
    	 if (temp != null) { 
             head = temp.prev; 
         } 
    	
    	
    }
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseDoublyList list = new ReverseDoublyList(); 
		list.push(2); 
        list.push(4); 
        list.push(8); 
        list.push(10); 
        System.out.println("Original linked list "); 
        list.printList(head); 
  
        list.reverse(); 
        System.out.println(""); 
        System.out.println("The reversed Linked List is "); 
        list.printList(head); 
	}
	void push(int new_data) { 
        /* allocate node */
        Node new_node = new Node(new_data); 
  
        /* since we are adding at the begining,  
         prev is always NULL */
        new_node.prev = null; 
  
        /* link the old list off the new node */
        new_node.next = head; 
  
        /* change prev of head node to new node */
        if (head != null) { 
            head.prev = new_node; 
        } 
  
        /* move the head to point to the new node */
        head = new_node; 
    } 

}
