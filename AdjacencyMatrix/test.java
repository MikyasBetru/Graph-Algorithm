
package graphadjacencymatrix;
import java.util.Scanner;


public class test {
     public static void main(String[] args) {
GraphAjdacencyMatrix graph = new GraphAjdacencyMatrix(5);
Scanner sc = new Scanner(System.in);  

int i=0;
while(i<5){
     System.out.println("Enter the first and second");
     int[] numbers = new int [2];      

     sc.nextLine();   
     for (int j = 0; j < numbers.length; j++)   
     {  
          numbers[j] = Integer.parseInt(sc.nextLine()); 

     }  
     graph.addEdge(numbers[0], numbers[1]);
     i++;
}
graph.toString();
	    }
    
}
