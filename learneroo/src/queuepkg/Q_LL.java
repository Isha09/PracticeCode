package queuepkg;
import basicds.*;

public class Q_LL {
	
	LinkedList list=null;
	Node head,tail=null;
	
	
	public Q_LL(){
		list=new LinkedList();
		head=list.head;
		tail=list.tail;
		
		
	}
	public void dequeue(){
		list.remove(0);
		head=list.head;
		
		
	}
	public void enqueue(int a){
		list.add(a);
		tail=list.tail;
		
		
	}

}
