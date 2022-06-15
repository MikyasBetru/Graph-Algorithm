
package dijkstraadjacencymatrix;
import java.util.Scanner;
import dijkstraadjacencymatrix.DijkstraAdjacencyMatrix.Graph;


public class test {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 int vertices = 6;
 Graph graph = new Graph(vertices);
 int sourceVertex = 0;

 int i=0;
 while(i<8){
     System.out.println("Enter the first, second and third");
     int[] numbers = new int [3];      

     sc.nextLine();   
     for (int j = 0; j < numbers.length; j++)   
     {  
          numbers[j] = Integer.parseInt(sc.nextLine()); 

     }  
     graph.addEdge(numbers[0], numbers[1],numbers[2]);
     i++;
}

 graph.dijkstra_GetMinDistances(sourceVertex);
 }
    
}
