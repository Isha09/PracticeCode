package basicds;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int a = in.nextInt();
            int b= in.nextInt();
            if(a == -6){
                System.out.println(list.get(b)); 
            }
            else if(a == -9){
                list.add(b);
            }
            else if(a>0){
            	list.add(a,b);
            }
            else if(a==-1){
            	list.remove(b);
            }

	}

}
}
