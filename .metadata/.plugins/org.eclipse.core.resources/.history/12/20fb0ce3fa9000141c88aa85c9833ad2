package basicds;

public class LinkedList {

    Node head;
    Node tail;

    /*
     * Adds Node to end of list with given `num` as data
     * Make sure it correctly sets the head (and tail) 
     * when adding the first item to the list
     */
    public void add(int num){
        // your code here 
    	Node newnode = new Node(num);
    	if(head ==null){
    		head=newnode;
    		tail=newnode;
    	}
    	else{
    		tail.next=newnode;
    		tail=newnode;
    	}
    }

    /*
     * Returns value of node at given index
     */
    public int get(int index){
        // your code here  
    	int j=0;
    	Node mynode;
    	mynode=head;
    	while(j<index){
    		mynode=mynode.next;
    		j++;
    	}
    	return mynode.data;
    	
    }

}
