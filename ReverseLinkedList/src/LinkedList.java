
public class LinkedList {
 Node head;
 String NodeList="";
 String reverseList="";
 
 public void Insert(int data) {
	 Node node=new Node();
	 node.data=data;
	 node.next=null;
	 
	 if(head==null) {
		 head=node;
	 }else {
		Node n=head;
		
		while(n.next!=null) {
			n=n.next;
		}
		n.next=node;
	 }
 }
 
 public void Show() {
	 Node n=head;
	 while(n.next!=null) {
		 NodeList=NodeList+n.data+ " ";
		 n=n.next;
		 
	 }
	 NodeList=NodeList+n.data+ " ";
	 System.out.println("Orginal Linked List :"+ NodeList);
	 int length=NodeList.length();
	 
     for ( int i = length - 1; i >= 0; i-- )  {
         reverseList = reverseList + NodeList.charAt(i);  
	 }
	 System.out.println("Reverse Linked List :" +reverseList);
 }
}
