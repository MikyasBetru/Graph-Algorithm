
import java.util.Scanner;
public class test {
   
	public static void main(String[] args) {
		AdjacencyList l=new AdjacencyList(10);
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<3){
     		System.out.println("Enter the first and second");
     		int[] numbers = new int [3];      

     		sc.nextLine();   
     		for (int j = 0; j < numbers.length; j++)   
    		 {  
				numbers[j] = Integer.parseInt( sc.nextLine()); 

     		}  
     		l.addEdge(numbers[0], numbers[1], numbers[2]);
     		i++;
		}

		
		System.out.println(l);
		int x= 0;
		while(x<10){
			System.out.println(l.isConnected(9,x));
			x++;
		}
		
		
	}
}
