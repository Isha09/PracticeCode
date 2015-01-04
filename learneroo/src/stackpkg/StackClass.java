package stackpkg;
import basicds.Node;
public class StackClass {
	
	Node head;
    Node tail;
    /*
     * Push value of node in stack
     */
    public void push(int num){
    	Node newnode = new Node(num);
    	if(head == null){
    		head=newnode;
    		tail=newnode;
    	}
    	else{
    		newnode.next=head;
    		head=newnode;
    	}
    	
    }
    /*
     * Pop value of node in stack
     */
    public int pop(){
    	Node popnode;
    	popnode=head;
    	if(head != null){
    		head=head.next;
    	}
    	return popnode.data;
    }
	
	

}
