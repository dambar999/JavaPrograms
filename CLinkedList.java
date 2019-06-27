
public class CLinkedList {
	static Node head=null;
	static class Node{
		int item;
		Node next;
		Node(int data){
			this.item=data;
			this.next=null;
			
		}
	}
	public static void push(int item) {
		Node new_node= new Node(item);
		new_node.next=head;
		head= new_node;
		
	}
	void printList(Node headref)  
    { 
        while (headref != null)  
        { 
            System.out.print(headref.item + " "); 
            headref = headref.next; 
        } 
    } 
      

	public static void main(String[] args) {
		CLinkedList li= new CLinkedList();
		    li.push(15); 
	        li.push(10); 
	        li.push(5); 
	        li.push(20); 
	        li.push(3); 
	        li.push(2);  
	        System.out.println("Linked List without sorting is :"); 
	        li.printList(li.head); 
	  
	        // Apply merge Sort 
	        li.head = li.mergeSort(li.head); 
	        System.out.print("\n Sorted Linked List is: \n"); 
	        li.printList(li.head); 
		

	}
	public static void mergeSort(Node head) {
		Node middleNode=null;
		middleNode=getMiddleNode();
		Node middleNext=middleNode.next;
		middleNode.next=null;
		mergeSort(head);
		mergeSort(middleNode);
		
		
	}
	
	public static Node getMiddle(Node head) {
		
		Node fastPtr=head.next;
		Node slowPtr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		return slowPtr;
	}

}
