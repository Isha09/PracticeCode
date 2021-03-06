package basicds;

public class LinkedList {

    public Node head;
    public Node tail;

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
     * Insert value of node at given index
     */
    public void add(int index, int item){
        // your code here 
    	Node newnode = new Node(item);
    	Node track;
    	track=head;
    	int j=1;
    	if(head ==null){
    		head=newnode;
    		tail=newnode;
    	}
    	else{
    		while(j<index)
    		{
    			track=track.next;
    			j++;
    		}
    		newnode.next=track.next;
    		track.next=newnode;
    		
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
    /*
     * Removes a node at given index
     */
    public void remove(int index){
    	Node removenode;
    	Node prev=head;
    	removenode=head;
    	int j=0;
    	if(head!=null && tail!=null){
    	while(j<index){
    		prev=removenode;
    		removenode=removenode.next;
    		j++;	
    	}
    	if(removenode==prev){
    		head = prev.next;
    	}
    	else{
    	prev.next=removenode.next;
    	}
    	System.out.print(removenode.data+" ");
    	
    }
    
    else 
    {
    	System.out.print(-1+" ");
    }
    }

}
