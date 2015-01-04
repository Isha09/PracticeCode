package stackpkg;
import java.util.*;
public class Main {
	static void doStuff(int[] ar){
		int i;
		StackClass mystack=new StackClass();
		for(i=0;i<ar.length;i++){
			if(ar[i]==-1)
			{
				System.out.print(mystack.pop()+" ");
			}
			else 
			{
				mystack.push(ar[i]);
			}	
				
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		for(int c=0;c<t;c++){
			int n = in.nextInt();
			int[] ar = new int[n];
			for(int i=0;i<n;i++){
				ar[i]=in.nextInt();
			}
			doStuff(ar);
		}
        }

	}


