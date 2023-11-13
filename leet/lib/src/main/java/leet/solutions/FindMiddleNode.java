package leet.solutions;
import utils.leet.ListNode;

public class FindMiddleNode {

	public ListNode middleNode(ListNode head) {
		
		ListNode copy = head; 
		int length = 0;
		int targetNode = 0; 
	
		while(copy != null){
			length++; 
			copy = copy.getNext();   
		}
	
		targetNode = length/2; 
	
		for(int i = 0; i < targetNode; i++){
			head = head.getNext(); 
		}
		   
		return head;  
	}
}
